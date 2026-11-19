; cpr::Session::GetCurlHolder @ 008f2a04
008f2a04	ldr x9,[x0, #0x18]
008f2a08	str x9,[x8]
008f2a0c	ldr x9,[x0, #0x20]
008f2a10	str x9,[x8, #0x8]
008f2a14	cbz x9,0x008f2a2c
008f2a18	add x8,x9,#0x8
008f2a1c	ldxr x9,[x8]
008f2a20	add x9,x9,#0x1
008f2a24	stxr w10,x9,[x8]
008f2a28	cbnz w10,0x008f2a1c
008f2a2c	ret
