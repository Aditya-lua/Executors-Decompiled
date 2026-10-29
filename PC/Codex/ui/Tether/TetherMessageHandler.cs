using System;

namespace Tether;

public delegate void TetherMessageHandler(TetherClient Client, ReadOnlyMemory<byte> Data);
