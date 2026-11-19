; psa_pake_set_user @ 00b8fe38
00b8fe38	str x23,[sp, #-0x40]!
00b8fe3c	stp x22,x21,[sp, #0x10]
00b8fe40	stp x20,x19,[sp, #0x20]
00b8fe44	stp x29,x30,[sp, #0x30]
00b8fe48	add x29,sp,#0x30
00b8fe4c	ldrb w8,[x0, #0xc]
00b8fe50	mov x20,x2
00b8fe54	mov x19,x0
00b8fe58	mov x21,x1
00b8fe5c	cmp w8,#0x2
00b8fe60	b.eq 0x00b8fe88
00b8fe64	cmp w8,#0x1
00b8fe68	b.ne 0x00b8feb0
00b8fe6c	cbz x20,0x00b8feb8
00b8fe70	ldr x8,[x19, #0x38]
00b8fe74	cbz x8,0x00b8ff0c
00b8fe78	mov w20,#0xffffff77
00b8fe7c	ldr x0,[x19, #0x20]
00b8fe80	cbnz x0,0x00b8fec4
00b8fe84	b 0x00b8fecc
00b8fe88	ldr w8,[x19]
00b8fe8c	cmp w8,#0x1
00b8fe90	b.ne 0x00b8feb0
00b8fe94	add x0,x19,#0x20
00b8fe98	bl 0x00c430b0
00b8fe9c	ldrb w8,[x19, #0xc]
00b8fea0	mov w20,#0xffffff77
00b8fea4	cmp w8,#0x1
00b8fea8	b.eq 0x00b8febc
00b8feac	b 0x00b8fee4
00b8feb0	mov w20,#0xffffff77
00b8feb4	b 0x00b8fee4
00b8feb8	mov w20,#0xffffff79
00b8febc	ldr x0,[x19, #0x20]
00b8fec0	cbz x0,0x00b8fecc
00b8fec4	ldr x1,[x19, #0x28]
00b8fec8	bl 0x00c42230
00b8fecc	ldr x0,[x19, #0x30]
00b8fed0	cbz x0,0x00b8fed8
00b8fed4	bl 0x00c30960
00b8fed8	ldr x0,[x19, #0x40]
00b8fedc	cbz x0,0x00b8fee4
00b8fee0	bl 0x00c30960
00b8fee4	mov w2,#0x390
00b8fee8	mov x0,x19
00b8feec	mov w1,wzr
00b8fef0	bl 0x00c301c0
00b8fef4	mov w0,w20
00b8fef8	ldp x29,x30,[sp, #0x30]
00b8fefc	ldp x20,x19,[sp, #0x20]
00b8ff00	ldp x22,x21,[sp, #0x10]
00b8ff04	ldr x23,[sp], #0x40
00b8ff08	ret
00b8ff0c	mov w0,#0x1
00b8ff10	mov x1,x20
00b8ff14	bl 0x00c30a30
00b8ff18	str x0,[x19, #0x30]
00b8ff1c	cbz x0,0x00b8ff6c
00b8ff20	mov x22,x0
00b8ff24	mov w1,#0x1
00b8ff28	mov x0,x20
00b8ff2c	bl 0x00c30a30
00b8ff30	mov x23,x0
00b8ff34	cbz x0,0x00b8ff6c
00b8ff38	mov x0,x23
00b8ff3c	mov x1,x21
00b8ff40	mov x2,x20
00b8ff44	bl 0x00c2ffd0
00b8ff48	mov x0,x22
00b8ff4c	mov x1,x23
00b8ff50	mov x2,x20
00b8ff54	bl 0x00c2ffd0
00b8ff58	mov x0,x23
00b8ff5c	str x20,[x19, #0x38]
00b8ff60	bl 0x00c30960
00b8ff64	mov w20,wzr
00b8ff68	b 0x00b8fef4
00b8ff6c	mov w20,#0xffffff73
00b8ff70	ldr x0,[x19, #0x20]
00b8ff74	cbnz x0,0x00b8fec4
00b8ff78	b 0x00b8fecc
