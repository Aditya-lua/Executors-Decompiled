; std::__ndk1::vector<cpr::CertInfo,std::__ndk1::allocator<cpr::CertInfo>>::__emplace_back_slow_path<cpr::CertInfo&> @ 00901b68
00901b68	str x27,[sp, #-0x60]!
00901b6c	stp x26,x25,[sp, #0x10]
00901b70	stp x24,x23,[sp, #0x20]
00901b74	stp x22,x21,[sp, #0x30]
00901b78	stp x20,x19,[sp, #0x40]
00901b7c	stp x29,x30,[sp, #0x50]
00901b80	add x29,sp,#0x50
00901b84	ldp x9,x8,[x0]
00901b88	orr x10,xzr,#-0x5555555555555556
00901b8c	movk x10,#0xaaab
00901b90	orr x25,xzr,#-0x5555555555555556
00901b94	sub x8,x8,x9
00901b98	asr x8,x8,#0x3
00901b9c	mul x19,x8,x10
00901ba0	movk x25,#0xaaa, LSL #48
00901ba4	add x8,x19,#0x1
00901ba8	mov x21,x0
00901bac	cmp x8,x25
00901bb0	mov x22,x1
00901bb4	b.hi 0x00901d04
00901bb8	ldr x11,[x21, #0x10]
00901bbc	sub x9,x11,x9
00901bc0	asr x9,x9,#0x3
00901bc4	mul x9,x9,x10
00901bc8	orr x10,xzr,#0x5555555555555555
00901bcc	movk x10,#0x5554
00901bd0	movk x10,#0x555, LSL #48
00901bd4	cmp x9,x10
00901bd8	b.hi 0x00901bec
00901bdc	lsl x9,x9,#0x1
00901be0	cmp x9,x8
00901be4	csel x25,x8,x9,cc
00901be8	cbz x25,0x00901cf8
00901bec	add x8,x25,x25, LSL #0x1
00901bf0	lsl x0,x8,#0x3
00901bf4	bl 0x00c2fed0
00901bf8	mov x20,x0
00901bfc	mov x23,x0
00901c00	orr w27,wzr,#0x18
00901c04	madd x19,x19,x27,x23
00901c08	mov x0,x19
00901c0c	mov x1,x22
00901c10	bl 0x00c30ca0
00901c14	ldp x26,x22,[x21]
00901c18	add x24,x19,#0x18
00901c1c	cmp x22,x26
00901c20	b.eq 0x00901c48
00901c24	sub x22,x22,#0x18
00901c28	sub x0,x19,#0x18
00901c2c	mov x1,x22
00901c30	bl 0x00c30ca0
00901c34	cmp x26,x22
00901c38	sub x19,x19,#0x18
00901c3c	b.ne 0x00901c24
00901c40	ldp x20,x26,[x21]
00901c44	b 0x00901c4c
00901c48	mov x20,x26
00901c4c	madd x8,x25,x27,x23
00901c50	cmp x26,x20
00901c54	stp x19,x24,[x21]
00901c58	str x8,[x21, #0x10]
00901c5c	b.eq 0x00901cb8
00901c60	mov x19,x26
00901c64	ldr x21,[x19, #-0x18]!
00901c68	cbz x21,0x00901cac
00901c6c	ldur x8,[x26, #-0x10]
00901c70	cmp x8,x21
00901c74	b.eq 0x00901ca0
00901c78	mov x22,x8
00901c7c	ldrb w9,[x22, #-0x18]!
00901c80	tbz w9,#0x0,0x00901c8c
00901c84	ldur x0,[x8, #-0x8]
00901c88	bl 0x00c301d0
00901c8c	cmp x21,x22
00901c90	mov x8,x22
00901c94	b.ne 0x00901c7c
00901c98	ldr x0,[x19]
00901c9c	b 0x00901ca4
00901ca0	mov x0,x21
00901ca4	stur x21,[x26, #-0x10]
00901ca8	bl 0x00c301d0
00901cac	cmp x19,x20
00901cb0	mov x26,x19
00901cb4	b.ne 0x00901c64
00901cb8	cbz x20,0x00901cdc
00901cbc	mov x0,x20
00901cc0	ldp x29,x30,[sp, #0x50]
00901cc4	ldp x20,x19,[sp, #0x40]
00901cc8	ldp x22,x21,[sp, #0x30]
00901ccc	ldp x24,x23,[sp, #0x20]
00901cd0	ldp x26,x25,[sp, #0x10]
00901cd4	ldr x27,[sp], #0x60
00901cd8	b 0x00c301d0
00901cdc	ldp x29,x30,[sp, #0x50]
00901ce0	ldp x20,x19,[sp, #0x40]
00901ce4	ldp x22,x21,[sp, #0x30]
00901ce8	ldp x24,x23,[sp, #0x20]
00901cec	ldp x26,x25,[sp, #0x10]
00901cf0	ldr x27,[sp], #0x60
00901cf4	ret
00901cf8	mov x20,xzr
00901cfc	mov x23,xzr
00901d00	b 0x00901c00
00901d04	mov x0,x21
00901d08	bl 0x00c30bd0
