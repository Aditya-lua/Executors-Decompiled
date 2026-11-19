; FUN_008a1188 @ 008a1188
008a1188	stp x29,x30,[sp, #-0x20]!
008a118c	str x19,[sp, #0x10]
008a1190	mov x29,sp
008a1194	mov x19,x0
008a1198	ldr x0,[x0, #0x18]
008a119c	adrp x8,0xc4c000
008a11a0	add x8,x8,#0x48
008a11a4	str x8,[x19]
008a11a8	cbz x0,0x008a11d8
008a11ac	bl 0x00c301d0
008a11b0	ldr x0,[x19, #0x30]
008a11b4	str xzr,[x19, #0x18]
008a11b8	bl 0x00c301d0
008a11bc	mov x0,xzr
008a11c0	stp xzr,xzr,[x19, #0x20]
008a11c4	str xzr,[x19, #0x30]
008a11c8	bl 0x00c301d0
008a11cc	mov w8,#0x40
008a11d0	str xzr,[x19, #0x38]
008a11d4	strb w8,[x19, #0x48]
008a11d8	ldr x0,[x19, #0x30]
008a11dc	ldr x19,[sp, #0x10]
008a11e0	ldp x29,x30,[sp], #0x20
008a11e4	b 0x00c301d0
