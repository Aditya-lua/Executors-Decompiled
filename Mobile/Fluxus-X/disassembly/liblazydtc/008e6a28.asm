; std::__ndk1::__murmur2_or_cityhash<unsigned_long,64ul>::__hash_len_0_to_16 @ 008e6a28
008e6a28	cmp x1,#0x9
008e6a2c	mov x8,x0
008e6a30	b.cc 0x008e6a90
008e6a34	ldr x9,[x8]
008e6a38	add x8,x8,x1
008e6a3c	ldur x8,[x8, #-0x8]
008e6a40	mov w11,#0x40
008e6a44	and x10,x1,#0xffffffff
008e6a48	sub w11,w11,w1
008e6a4c	add x12,x8,x1
008e6a50	lsr x10,x12,x10
008e6a54	lsl x11,x12,x11
008e6a58	orr x10,x11,x10
008e6a5c	mov x11,#0x2d69
008e6a60	movk x11,#0xeb38, LSL #16
008e6a64	movk x11,#0xea08, LSL #32
008e6a68	eor x9,x10,x9
008e6a6c	movk x11,#0x9ddf, LSL #48
008e6a70	mul x9,x9,x11
008e6a74	eor x10,x9,x10
008e6a78	eor x9,x10,x9, LSR #0x2f
008e6a7c	mul x9,x9,x11
008e6a80	eor x9,x9,x9, LSR #0x2f
008e6a84	mul x9,x9,x11
008e6a88	eor x0,x9,x8
008e6a8c	ret
008e6a90	cmp x1,#0x4
008e6a94	b.cc 0x008e6adc
008e6a98	ldr w9,[x8]
008e6a9c	add x8,x8,x1
008e6aa0	ldur w8,[x8, #-0x4]
008e6aa4	mov x10,#0x2d69
008e6aa8	lsl w9,w9,#0x3
008e6aac	movk x10,#0xeb38, LSL #16
008e6ab0	add x9,x9,x1
008e6ab4	movk x10,#0xea08, LSL #32
008e6ab8	eor x9,x9,x8
008e6abc	movk x10,#0x9ddf, LSL #48
008e6ac0	mul x9,x9,x10
008e6ac4	eor x8,x9,x8
008e6ac8	eor x8,x8,x9, LSR #0x2f
008e6acc	mul x8,x8,x10
008e6ad0	eor x8,x8,x8, LSR #0x2f
008e6ad4	mul x0,x8,x10
008e6ad8	ret
008e6adc	mov x0,#0x404f
008e6ae0	movk x0,#0x2f90, LSL #16
008e6ae4	movk x0,#0x6a3b, LSL #32
008e6ae8	movk x0,#0x9ae1, LSL #48
008e6aec	cbz x1,0x008e6b30
008e6af0	add x9,x8,x1
008e6af4	lsr x10,x1,#0x1
008e6af8	ldrb w11,[x8]
008e6afc	ldrb w8,[x8, x10]
008e6b00	ldurb w9,[x9, #-0x1]
008e6b04	mov x10,#0x6557
008e6b08	movk x10,#0x509e, LSL #16
008e6b0c	movk x10,#0xd7c7, LSL #32
008e6b10	movk x10,#0xc949, LSL #48
008e6b14	bfm x11,x8,#0x38,#0x7
008e6b18	add w8,w1,w9, LSL #0x2
008e6b1c	mul x9,x11,x0
008e6b20	mul x8,x8,x10
008e6b24	eor x8,x8,x9
008e6b28	eor x8,x8,x8, LSR #0x2f
008e6b2c	mul x0,x8,x0
008e6b30	ret
