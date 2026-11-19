; FUN_00a73b80 @ 00a73b80
00a73b80	stp x22,x21,[sp, #-0x30]!
00a73b84	stp x20,x19,[sp, #0x10]
00a73b88	stp x29,x30,[sp, #0x20]
00a73b8c	ldr x22,[x2, #0x20]
00a73b90	mov w21,w0
00a73b94	add x29,sp,#0x20
00a73b98	mov x19,x2
00a73b9c	mov x0,x22
00a73ba0	mov x20,x1
00a73ba4	bl 0x00c37cd0
00a73ba8	cmp w0,#0x198
00a73bac	b.ne 0x00a73bf4
00a73bb0	mov x0,x22
00a73bb4	bl 0x00c3a8b0
00a73bb8	bl 0x00c3af70
00a73bbc	tbnz w0,#0x1f,0x00a73c1c
00a73bc0	ldr x8,[x19, #0x30]
00a73bc4	ldr w8,[x8, #0x8]
00a73bc8	cmp w8,#0x1
00a73bcc	b.ne 0x00a73c48
00a73bd0	str w0,[x19, #0x1c]
00a73bd4	str xzr,[x19, #0x20]
00a73bd8	mov x1,x20
00a73bdc	mov x2,x19
00a73be0	ldp x29,x30,[sp, #0x20]
00a73be4	ldp x20,x19,[sp, #0x10]
00a73be8	mov w0,w21
00a73bec	ldp x22,x21,[sp], #0x30
00a73bf0	b 0x00a6fd84
00a73bf4	bl 0x00c342a0
00a73bf8	adrp x0,0x2b9000
00a73bfc	adrp x2,0x2cd000
00a73c00	add x0,x0,#0xe99
00a73c04	add x2,x2,#0xb50
00a73c08	mov w1,#0x6f0
00a73c0c	bl 0x00c342b0
00a73c10	orr w0,wzr,#0x6
00a73c14	orr w1,wzr,#0xe0
00a73c18	b 0x00a73c40
00a73c1c	bl 0x00c342a0
00a73c20	adrp x0,0x2b9000
00a73c24	adrp x2,0x2cd000
00a73c28	add x0,x0,#0xe99
00a73c2c	add x2,x2,#0xb50
00a73c30	mov w1,#0x6ea
00a73c34	bl 0x00c342b0
00a73c38	orr w0,wzr,#0x6
00a73c3c	mov w1,#0xa3
00a73c40	mov x2,xzr
00a73c44	bl 0x00c342c0
00a73c48	ldp x29,x30,[sp, #0x20]
00a73c4c	ldp x20,x19,[sp, #0x10]
00a73c50	mov w0,wzr
00a73c54	ldp x22,x21,[sp], #0x30
00a73c58	ret
