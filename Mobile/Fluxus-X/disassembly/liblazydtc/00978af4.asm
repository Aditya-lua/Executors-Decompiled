; std::__ndk1::__deque_base<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>::clear @ 00978af4
00978af4	stp x24,x23,[sp, #-0x40]!
00978af8	stp x22,x21,[sp, #0x10]
00978afc	stp x20,x19,[sp, #0x20]
00978b00	stp x29,x30,[sp, #0x30]
00978b04	add x29,sp,#0x30
00978b08	ldp x8,x9,[x0, #0x8]
00978b0c	mov x19,x0
00978b10	cmp x9,x8
00978b14	b.eq 0x00978be8
00978b18	ldr x10,[x19, #0x20]
00978b1c	mov x21,x19
00978b20	lsr x11,x10,#0x3
00978b24	and x11,x11,#0x1ffffffffffffff8
00978b28	add x22,x8,x11
00978b2c	ldr x11,[x22]
00978b30	ldr x12,[x21, #0x28]!
00978b34	add x12,x12,x10
00978b38	lsr x13,x12,#0x3
00978b3c	and x13,x13,#0x1ffffffffffffff8
00978b40	ldr x13,[x8, x13#0x0]
00978b44	and x10,x10,#0x3f
00978b48	add x24,x11,x10, LSL #0x6
00978b4c	and x10,x12,#0x3f
00978b50	add x23,x13,x10, LSL #0x6
00978b54	cmp x23,x24
00978b58	b.eq 0x00978bec
00978b5c	ldr x0,[x24, #0x30]
00978b60	add x8,x24,#0x10
00978b64	cmp x8,x0
00978b68	b.eq 0x00978b7c
00978b6c	cbz x0,0x00978b88
00978b70	ldr x8,[x0]
00978b74	ldr x8,[x8, #0x28]
00978b78	b 0x00978b84
00978b7c	ldr x8,[x0]
00978b80	ldr x8,[x8, #0x20]
00978b84	blr x8
00978b88	ldr x20,[x24, #0x8]
00978b8c	cbz x20,0x00978bc0
00978b90	add x8,x20,#0x8
00978b94	ldaxr x9,[x8]
00978b98	sub x10,x9,#0x1
00978b9c	stlxr w11,x10,[x8]
00978ba0	cbnz w11,0x00978b94
00978ba4	cbnz x9,0x00978bc0
00978ba8	ldr x8,[x20]
00978bac	mov x0,x20
00978bb0	ldr x8,[x8, #0x10]
00978bb4	blr x8
00978bb8	mov x0,x20
00978bbc	bl 0x00c2ff00
00978bc0	ldr x8,[x22]
00978bc4	add x24,x24,#0x40
00978bc8	sub x8,x24,x8
00978bcc	cmp x8,#0x1, LSL #12
00978bd0	b.ne 0x00978bd8
00978bd4	ldr x24,[x22, #0x8]!
00978bd8	cmp x23,x24
00978bdc	b.ne 0x00978b5c
00978be0	ldp x8,x9,[x19, #0x8]
00978be4	b 0x00978bec
00978be8	add x21,x19,#0x28
00978bec	sub x9,x9,x8
00978bf0	asr x9,x9,#0x3
00978bf4	cmp x9,#0x3
00978bf8	str xzr,[x21]
00978bfc	b.cc 0x00978c24
00978c00	ldr x0,[x8]
00978c04	bl 0x00c301d0
00978c08	ldp x8,x9,[x19, #0x8]
00978c0c	add x8,x8,#0x8
00978c10	sub x9,x9,x8
00978c14	asr x9,x9,#0x3
00978c18	cmp x9,#0x2
00978c1c	str x8,[x19, #0x8]
00978c20	b.hi 0x00978c00
00978c24	cmp x9,#0x1
00978c28	b.eq 0x00978c3c
00978c2c	cmp x9,#0x2
00978c30	b.ne 0x00978c44
00978c34	mov w8,#0x40
00978c38	b 0x00978c40
00978c3c	mov w8,#0x20
00978c40	str x8,[x19, #0x20]
00978c44	ldp x29,x30,[sp, #0x30]
00978c48	ldp x20,x19,[sp, #0x20]
00978c4c	ldp x22,x21,[sp, #0x10]
00978c50	ldp x24,x23,[sp], #0x40
00978c54	ret
