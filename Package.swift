// swift-tools-version: 5.7
import PackageDescription
let package = Package(
    name: "FengshuibedroomUrlTools",
    products: [
        .library(name: "FengshuibedroomUrlTools", targets: ["FengshuibedroomUrlTools"]),
    ],
    targets: [
        .target(name: "FengshuibedroomUrlTools", path: "swift/Sources/FengshuibedroomUrlTools"),
        .executableTarget(name: "fengshuibedroom-url-check", dependencies: ["FengshuibedroomUrlTools"], path: "swift/Check"),
    ]
)
