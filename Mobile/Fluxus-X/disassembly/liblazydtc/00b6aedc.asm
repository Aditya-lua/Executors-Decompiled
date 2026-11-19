; mbedtls_cipher_auth_decrypt_ext @ 00b6aedc
00b6aedc	sub sp,sp,#0x20
00b6aee0	stp x29,x30,[sp, #0x10]
00b6aee4	add x29,sp,#0x10
00b6aee8	ldr x13,[x0]
00b6aeec	mov x10,x5
00b6aef0	ldp x5,x9,[x29, #0x18]
00b6aef4	ldr x11,[x29, #0x10]
00b6aef8	ldr w12,[x13, #0x8]
00b6aefc	mov x8,x4
00b6af00	mov x4,x3
00b6af04	mov x3,x2
00b6af08	and w14,w12,#0xe000
00b6af0c	cmp w14,#0xc, LSL #12
00b6af10	mov x2,x1
00b6af14	b.ne 0x00b6af50
00b6af18	orr x8,x8,x3
00b6af1c	orr x8,x8,x9
00b6af20	cbnz x8,0x00b6af60
00b6af24	ldr x0,[x0, #0x50]
00b6af28	ldp x29,x30,[sp, #0x10]
00b6af2c	and w8,w12,#0xf000
00b6af30	cmp w8,#0xc, LSL #12
00b6af34	cset w1,ne
00b6af38	mov x2,x10
00b6af3c	mov x3,x6
00b6af40	mov x4,x7
00b6af44	mov x6,x11
00b6af48	add sp,sp,#0x20
00b6af4c	b 0x00c42200
00b6af50	subs x1,x6,x9
00b6af54	b.cc 0x00b6af60
00b6af58	cmp x1,x11
00b6af5c	b.ls 0x00b6af74
00b6af60	mov w9,#0xffff9f00
00b6af64	ldp x29,x30,[sp, #0x10]
00b6af68	mov w0,w9
00b6af6c	add sp,sp,#0x20
00b6af70	ret
00b6af74	add x14,x10,x6
00b6af78	ubfx w11,w12,#0xc,#0x4
00b6af7c	cmp w11,#0x8
00b6af80	sub x6,x14,x9
00b6af84	b.eq 0x00b6afb0
00b6af88	cmp w11,#0x6
00b6af8c	b.ne 0x00b6afd0
00b6af90	str x1,[x5]
00b6af94	ldr x0,[x0, #0x50]
00b6af98	stp x10,x7,[sp]
00b6af9c	mov x5,x8
00b6afa0	mov x7,x9
00b6afa4	bl 0x00c421a0
00b6afa8	cmn w0,#0x12
00b6afac	b 0x00b6b020
00b6afb0	str x1,[x5]
00b6afb4	ldr x0,[x0, #0x50]
00b6afb8	stp x6,x9,[sp]
00b6afbc	mov x5,x8
00b6afc0	mov x6,x10
00b6afc4	bl 0x00c41fd0
00b6afc8	cmn w0,#0xf
00b6afcc	b 0x00b6b020
00b6afd0	and w11,w12,#0xff0000
00b6afd4	cmp w11,#0x4d0, LSL #12
00b6afd8	b.ne 0x00b6b02c
00b6afdc	lsr w11,w12,#0x3
00b6afe0	cmp x13,#0x0
00b6afe4	and w11,w11,#0x1c
00b6afe8	csel x11,xzr,x11,eq
00b6afec	cmp x9,#0x10
00b6aff0	mov w9,#0xffff9f00
00b6aff4	b.ne 0x00b6af64
00b6aff8	cmp x11,x3
00b6affc	b.ne 0x00b6af64
00b6b000	str x1,[x5]
00b6b004	ldr x0,[x0, #0x50]
00b6b008	mov x3,x4
00b6b00c	mov x4,x8
00b6b010	mov x5,x6
00b6b014	mov x6,x10
00b6b018	bl 0x00c420c0
00b6b01c	cmn w0,#0x56
00b6b020	mov w8,#0xffff9d00
00b6b024	csel w9,w8,w0,eq
00b6b028	b 0x00b6af64
00b6b02c	mov w9,#0xffff9f80
00b6b030	b 0x00b6af64
