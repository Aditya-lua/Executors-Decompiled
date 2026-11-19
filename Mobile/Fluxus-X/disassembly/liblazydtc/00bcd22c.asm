; std::__ndk1::thread::join @ 00bcd22c
00bcd22c	paciasp
00bcd230	stp x29,x30,[sp, #-0x20]!
00bcd234	str x19,[sp, #0x10]
00bcd238	mov x29,sp
00bcd23c	mov x19,x0
00bcd240	ldr x0,[x0]
00bcd244	cbz x0,0x00bcd268
00bcd248	mov x1,xzr
00bcd24c	bl 0x00c31d00
00bcd250	cbnz w0,0x00bcd26c
00bcd254	str xzr,[x19]
00bcd258	ldr x19,[sp, #0x10]
00bcd25c	ldp x29,x30,[sp], #0x20
00bcd260	autiasp
00bcd264	ret
00bcd268	mov w0,#0x16
00bcd26c	adrp x1,0x2ab000
00bcd270	add x1,x1,#0x205
00bcd274	bl 0x00c2ffc0
