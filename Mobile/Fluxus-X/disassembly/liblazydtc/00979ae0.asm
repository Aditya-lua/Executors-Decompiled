; std::__ndk1::__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>&>::push_back @ 00979ae0
00979ae0	stp x24,x23,[sp, #-0x40]!
00979ae4	stp x22,x21,[sp, #0x10]
00979ae8	stp x20,x19,[sp, #0x20]
00979aec	stp x29,x30,[sp, #0x30]
00979af0	add x29,sp,#0x30
00979af4	ldp x23,x8,[x0, #0x10]
00979af8	mov x19,x0
00979afc	mov x20,x1
00979b00	cmp x23,x8
00979b04	b.ne 0x00979c68
00979b08	ldp x22,x21,[x19]
00979b0c	subs x9,x21,x22
00979b10	b.ls 0x00979b58
00979b14	asr x8,x9,#0x3
00979b18	add x9,x8,#0x1
00979b1c	add x10,x8,#0x2
00979b20	cmp x9,#0x0
00979b24	csinc x8,x10,x8,lt
00979b28	subs x2,x23,x21
00979b2c	asr x8,x8,#0x1
00979b30	sub x22,x21,x8, LSL #0x3
00979b34	asr x23,x2,#0x3
00979b38	b.eq 0x00979b7c
00979b3c	mov x0,x22
00979b40	mov x1,x21
00979b44	neg x24,x8
00979b48	bl 0x00c2ff60
00979b4c	ldr x8,[x19, #0x8]
00979b50	add x8,x8,x24, LSL #0x3
00979b54	b 0x00979b80
00979b58	subs x8,x8,x22
00979b5c	asr x8,x8,#0x2
00979b60	csinc x24,x8,xzr,ne
00979b64	cbz x24,0x00979b8c
00979b68	lsr x8,x24,#0x3d
00979b6c	cbnz x8,0x00979c90
00979b70	lsl x0,x24,#0x3
00979b74	bl 0x00c2fed0
00979b78	b 0x00979b90
00979b7c	mov x8,x22
00979b80	add x23,x22,x23, LSL #0x3
00979b84	stp x8,x23,[x19, #0x8]
00979b88	b 0x00979c68
00979b8c	mov x0,xzr
00979b90	lsr x13,x24,#0x2
00979b94	cmp x21,x23
00979b98	add x9,x0,x13, LSL #0x3
00979b9c	add x8,x0,x24, LSL #0x3
00979ba0	b.eq 0x00979bcc
00979ba4	sub x10,x23,#0x8
00979ba8	sub x10,x10,x21
00979bac	lsr x14,x10,#0x3
00979bb0	add x11,x13,x14
00979bb4	add x12,x14,#0x1
00979bb8	cmp x12,#0x4
00979bbc	add x10,x11,#0x1
00979bc0	b.cs 0x00979bd4
00979bc4	mov x11,x9
00979bc8	b 0x00979c38
00979bcc	mov x23,x9
00979bd0	b 0x00979c50
00979bd4	add x14,x21,x14, LSL #0x3
00979bd8	add x14,x14,#0x8
00979bdc	cmp x9,x14
00979be0	b.cs 0x00979bf8
00979be4	add x11,x0,x11, LSL #0x3
00979be8	add x11,x11,#0x8
00979bec	cmp x21,x11
00979bf0	mov x11,x9
00979bf4	b.cc 0x00979c38
00979bf8	and x14,x12,#0x3ffffffffffffffc
00979bfc	add x13,x0,x13, LSL #0x3
00979c00	lsl x16,x14,#0x3
00979c04	add x15,x21,#0x10
00979c08	add x11,x9,x16
00979c0c	add x21,x21,x16
00979c10	add x13,x13,#0x10
00979c14	mov x16,x14
00979c18	ldp q0,q1,[x15, #-0x10]
00979c1c	add x15,x15,#0x20
00979c20	subs x16,x16,#0x4
00979c24	stp q0,q1,[x13, #-0x10]
00979c28	add x13,x13,#0x20
00979c2c	b.ne 0x00979c18
00979c30	cmp x12,x14
00979c34	b.eq 0x00979c48
00979c38	ldr x12,[x21], #0x8
00979c3c	cmp x23,x21
00979c40	str x12,[x11], #0x8
00979c44	b.ne 0x00979c38
00979c48	ldr x22,[x19]
00979c4c	add x23,x0,x10, LSL #0x3
00979c50	stp x0,x9,[x19]
00979c54	stp x23,x8,[x19, #0x10]
00979c58	cbz x22,0x00979c68
00979c5c	mov x0,x22
00979c60	bl 0x00c301d0
00979c64	ldr x23,[x19, #0x10]
00979c68	ldr x8,[x20]
00979c6c	str x8,[x23]
00979c70	ldr x8,[x19, #0x10]
00979c74	add x8,x8,#0x8
00979c78	str x8,[x19, #0x10]
00979c7c	ldp x29,x30,[sp, #0x30]
00979c80	ldp x20,x19,[sp, #0x20]
00979c84	ldp x22,x21,[sp, #0x10]
00979c88	ldp x24,x23,[sp], #0x40
00979c8c	ret
00979c90	mov w0,#0x10
00979c94	bl 0x00c30000
00979c98	mov x19,x0
00979c9c	adrp x1,0x2ad000
00979ca0	add x1,x1,#0x51
00979ca4	bl 0x00c30040
00979ca8	adrp x8,0xcb4000
00979cac	ldr x8,[x8, #0x980]
00979cb0	adrp x1,0xcb4000
00979cb4	adrp x2,0xcb4000
00979cb8	mov x0,x19
00979cbc	add x8,x8,#0x10
00979cc0	str x8,[x19]
00979cc4	ldr x1,[x1, #0x970]
00979cc8	ldr x2,[x2, #0x978]
00979ccc	bl 0x00c30020
