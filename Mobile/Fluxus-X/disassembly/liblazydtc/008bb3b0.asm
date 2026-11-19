; FUN_008bb3b0 @ 008bb3b0
008bb3b0	stp x29,x30,[sp, #-0x20]!
008bb3b4	str x19,[sp, #0x10]
008bb3b8	mov x29,sp
008bb3bc	adrp x8,0xd1f000
008bb3c0	add x8,x8,#0x1e0
008bb3c4	adrp x19,0xd1f000
008bb3c8	ldarb w8,[x8]
008bb3cc	tbz w8,#0x0,0x008bb3e4
008bb3d0	ldr x8,[x19, #0x1d8]
008bb3d4	add x0,x8,x0
008bb3d8	ldr x19,[sp, #0x10]
008bb3dc	ldp x29,x30,[sp], #0x20
008bb3e0	ret
008bb3e4	adrp x8,0xd1f000
008bb3e8	add x8,x8,#0x1e0
008bb3ec	str x0,[x29, #0x18]
008bb3f0	mov x0,x8
008bb3f4	bl 0x00c2fe90
008bb3f8	mov w8,w0
008bb3fc	ldr x0,[x29, #0x18]
008bb400	cbz w8,0x008bb3d0
008bb404	adrp x8,0xcca000
008bb408	ldr x0,[x8, #0x8c8]
008bb40c	bl 0x007fe1ec
008bb410	str x0,[x19, #0x1d8]
008bb414	adrp x0,0xd1f000
008bb418	add x0,x0,#0x1e0
008bb41c	bl 0x00c2fea0
008bb420	ldr x0,[x29, #0x18]
008bb424	b 0x008bb3d0
