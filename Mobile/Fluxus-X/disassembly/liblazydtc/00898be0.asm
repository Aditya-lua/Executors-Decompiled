; FUN_00898be0 @ 00898be0
00898be0	ldr x8,[x0, #0x28]
00898be4	cbz x8,0x00898c5c
00898be8	stp x29,x30,[sp, #-0x20]!
00898bec	str x19,[sp, #0x10]
00898bf0	mov x29,sp
00898bf4	ldr x8,[x0, #0x20]
00898bf8	mov x19,x0
00898bfc	cmp x8,x1
00898c00	b.ls 0x00898c38
00898c04	ldr x0,[x19]
00898c08	bl 0x00c301d0
00898c0c	ldr x0,[x19, #0x18]
00898c10	str xzr,[x19]
00898c14	bl 0x00c301d0
00898c18	mov x0,xzr
00898c1c	stp xzr,xzr,[x19, #0x8]
00898c20	str xzr,[x19, #0x18]
00898c24	bl 0x00c301d0
00898c28	mov w8,#0x40
00898c2c	str xzr,[x19, #0x20]
00898c30	strb w8,[x19, #0x30]
00898c34	b 0x00898c50
00898c38	ldr x8,[x19, #0x10]
00898c3c	cbz x8,0x00898c50
00898c40	ldr x0,[x19, #0x18]
00898c44	lsl x2,x8,#0x3
00898c48	mov w1,wzr
00898c4c	bl 0x00c301c0
00898c50	str xzr,[x19, #0x28]
00898c54	ldr x19,[sp, #0x10]
00898c58	ldp x29,x30,[sp], #0x20
00898c5c	ret
