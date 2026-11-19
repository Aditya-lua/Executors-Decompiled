; mbedtls_cipher_auth_encrypt_ext @ 00b6ad58
00b6ad58	sub sp,sp,#0x40
00b6ad5c	stp x20,x19,[sp, #0x20]
00b6ad60	stp x29,x30,[sp, #0x30]
00b6ad64	add x29,sp,#0x30
00b6ad68	ldr x12,[x0]
00b6ad6c	ldp x19,x20,[x29, #0x18]
00b6ad70	ldr x10,[x29, #0x10]
00b6ad74	mov x8,x5
00b6ad78	ldr w11,[x12, #0x8]
00b6ad7c	mov x9,x4
00b6ad80	mov x5,x3
00b6ad84	mov x4,x2
00b6ad88	and w13,w11,#0xe000
00b6ad8c	cmp w13,#0xc, LSL #12
00b6ad90	mov x3,x1
00b6ad94	b.ne 0x00b6add8
00b6ad98	orr x9,x9,x4
00b6ad9c	orr x9,x9,x20
00b6ada0	cbnz x9,0x00b6ade4
00b6ada4	ldr x0,[x0, #0x50]
00b6ada8	mov x5,x19
00b6adac	ldp x29,x30,[sp, #0x30]
00b6adb0	ldp x20,x19,[sp, #0x20]
00b6adb4	and w9,w11,#0xf000
00b6adb8	cmp w9,#0xc, LSL #12
00b6adbc	cset w1,ne
00b6adc0	mov x2,x8
00b6adc4	mov x3,x6
00b6adc8	mov x4,x7
00b6adcc	mov x6,x10
00b6add0	add sp,sp,#0x40
00b6add4	b 0x00c42210
00b6add8	add x13,x20,x6
00b6addc	cmp x13,x10
00b6ade0	b.ls 0x00b6adec
00b6ade4	mov w11,#0xffff9f00
00b6ade8	b 0x00b6aec0
00b6adec	ubfx w13,w11,#0xc,#0x4
00b6adf0	cmp w13,#0x8
00b6adf4	add x10,x7,x6
00b6adf8	b.eq 0x00b6ae2c
00b6adfc	cmp w13,#0x6
00b6ae00	b.ne 0x00b6ae58
00b6ae04	str x6,[x19]
00b6ae08	ldr x0,[x0, #0x50]
00b6ae0c	mov w1,#0x1
00b6ae10	str x7,[sp]
00b6ae14	mov x2,x6
00b6ae18	mov x6,x9
00b6ae1c	mov x7,x8
00b6ae20	stp x20,x10,[sp, #0x8]
00b6ae24	bl 0x00c421b0
00b6ae28	b 0x00b6aeb0
00b6ae2c	str x6,[x19]
00b6ae30	ldr x0,[x0, #0x50]
00b6ae34	mov x1,x6
00b6ae38	mov x2,x3
00b6ae3c	mov x3,x4
00b6ae40	mov x4,x5
00b6ae44	mov x5,x9
00b6ae48	mov x6,x8
00b6ae4c	stp x10,x20,[sp]
00b6ae50	bl 0x00c41fe0
00b6ae54	b 0x00b6aeb0
00b6ae58	and w13,w11,#0xff0000
00b6ae5c	cmp w13,#0x4d0, LSL #12
00b6ae60	b.ne 0x00b6aed4
00b6ae64	lsr w11,w11,#0x3
00b6ae68	cmp x12,#0x0
00b6ae6c	and w11,w11,#0x1c
00b6ae70	csel x12,xzr,x11,eq
00b6ae74	cmp x20,#0x10
00b6ae78	mov w11,#0xffff9f00
00b6ae7c	b.ne 0x00b6aeb4
00b6ae80	cmp x12,x4
00b6ae84	b.ne 0x00b6aeb4
00b6ae88	str x6,[x19]
00b6ae8c	ldr x0,[x0, #0x50]
00b6ae90	mov x1,x6
00b6ae94	mov x2,x3
00b6ae98	mov x3,x5
00b6ae9c	mov x4,x9
00b6aea0	mov x5,x8
00b6aea4	mov x6,x7
00b6aea8	mov x7,x10
00b6aeac	bl 0x00c420d0
00b6aeb0	mov w11,w0
00b6aeb4	ldr x8,[x19]
00b6aeb8	add x8,x8,x20
00b6aebc	str x8,[x19]
00b6aec0	ldp x29,x30,[sp, #0x30]
00b6aec4	ldp x20,x19,[sp, #0x20]
00b6aec8	mov w0,w11
00b6aecc	add sp,sp,#0x40
00b6aed0	ret
00b6aed4	mov w11,#0xffff9f80
00b6aed8	b 0x00b6aeb4
