; std::__ndk1::__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>>::push_front @ 009798c8
009798c8	str x25,[sp, #-0x50]!
009798cc	stp x24,x23,[sp, #0x10]
009798d0	stp x22,x21,[sp, #0x20]
009798d4	stp x20,x19,[sp, #0x30]
009798d8	stp x29,x30,[sp, #0x40]
009798dc	add x29,sp,#0x40
009798e0	ldp x8,x24,[x0]
009798e4	mov x20,x1
009798e8	mov x19,x0
009798ec	cmp x24,x8
009798f0	mov x21,x24
009798f4	b.eq 0x00979900
009798f8	mov x22,x21
009798fc	b 0x00979a60
00979900	ldp x23,x9,[x19, #0x10]
00979904	cmp x23,x9
00979908	b.cs 0x00979950
0097990c	sub x8,x9,x23
00979910	asr x8,x8,#0x3
00979914	add x9,x8,#0x1
00979918	add x10,x8,#0x2
0097991c	cmp x9,#0x0
00979920	csinc x8,x10,x8,lt
00979924	asr x25,x8,#0x1
00979928	subs x2,x23,x24
0097992c	add x8,x23,x25, LSL #0x3
00979930	b.eq 0x00979974
00979934	sub x22,x8,x2
00979938	mov x0,x22
0097993c	mov x1,x21
00979940	bl 0x00c2ff60
00979944	ldr x8,[x19, #0x10]
00979948	add x8,x8,x25, LSL #0x3
0097994c	b 0x00979978
00979950	subs x8,x9,x8
00979954	asr x8,x8,#0x2
00979958	csinc x25,x8,xzr,ne
0097995c	cbz x25,0x00979980
00979960	lsr x8,x25,#0x3d
00979964	cbnz x8,0x00979a8c
00979968	lsl x0,x25,#0x3
0097996c	bl 0x00c2fed0
00979970	b 0x00979984
00979974	mov x22,x8
00979978	stp x22,x8,[x19, #0x8]
0097997c	b 0x00979a60
00979980	mov x0,xzr
00979984	add x8,x25,#0x3
00979988	lsr x13,x8,#0x2
0097998c	cmp x24,x23
00979990	add x22,x0,x13, LSL #0x3
00979994	add x8,x0,x25, LSL #0x3
00979998	b.eq 0x009799c4
0097999c	sub x9,x23,#0x8
009799a0	sub x9,x9,x24
009799a4	lsr x12,x9,#0x3
009799a8	add x10,x12,x13
009799ac	add x11,x12,#0x1
009799b0	cmp x11,#0x4
009799b4	add x9,x10,#0x1
009799b8	b.cs 0x009799cc
009799bc	mov x10,x22
009799c0	b 0x00979a30
009799c4	mov x9,x22
009799c8	b 0x00979a48
009799cc	add x12,x24,x12, LSL #0x3
009799d0	add x12,x12,#0x8
009799d4	cmp x22,x12
009799d8	b.cs 0x009799f0
009799dc	add x10,x0,x10, LSL #0x3
009799e0	add x10,x10,#0x8
009799e4	cmp x24,x10
009799e8	mov x10,x22
009799ec	b.cc 0x00979a30
009799f0	and x12,x11,#0x3ffffffffffffffc
009799f4	add x13,x0,x13, LSL #0x3
009799f8	lsl x15,x12,#0x3
009799fc	add x14,x24,#0x10
00979a00	add x10,x22,x15
00979a04	add x21,x24,x15
00979a08	add x13,x13,#0x10
00979a0c	mov x15,x12
00979a10	ldp q0,q1,[x14, #-0x10]
00979a14	add x14,x14,#0x20
00979a18	subs x15,x15,#0x4
00979a1c	stp q0,q1,[x13, #-0x10]
00979a20	add x13,x13,#0x20
00979a24	b.ne 0x00979a10
00979a28	cmp x11,x12
00979a2c	b.eq 0x00979a40
00979a30	ldr x11,[x21], #0x8
00979a34	cmp x23,x21
00979a38	str x11,[x10], #0x8
00979a3c	b.ne 0x00979a30
00979a40	ldr x21,[x19]
00979a44	add x9,x0,x9, LSL #0x3
00979a48	stp x0,x22,[x19]
00979a4c	stp x9,x8,[x19, #0x10]
00979a50	cbz x21,0x00979a60
00979a54	mov x0,x21
00979a58	bl 0x00c301d0
00979a5c	ldr x22,[x19, #0x8]
00979a60	ldr x8,[x20]
00979a64	stur x8,[x22, #-0x8]
00979a68	ldr x8,[x19, #0x8]
00979a6c	sub x8,x8,#0x8
00979a70	str x8,[x19, #0x8]
00979a74	ldp x29,x30,[sp, #0x40]
00979a78	ldp x20,x19,[sp, #0x30]
00979a7c	ldp x22,x21,[sp, #0x20]
00979a80	ldp x24,x23,[sp, #0x10]
00979a84	ldr x25,[sp], #0x50
00979a88	ret
00979a8c	mov w0,#0x10
00979a90	bl 0x00c30000
00979a94	mov x19,x0
00979a98	adrp x1,0x2ad000
00979a9c	add x1,x1,#0x51
00979aa0	bl 0x00c30040
00979aa4	adrp x8,0xcb4000
00979aa8	ldr x8,[x8, #0x980]
00979aac	adrp x1,0xcb4000
00979ab0	adrp x2,0xcb4000
00979ab4	mov x0,x19
00979ab8	add x8,x8,#0x10
00979abc	str x8,[x19]
00979ac0	ldr x1,[x1, #0x970]
00979ac4	ldr x2,[x2, #0x978]
00979ac8	bl 0x00c30020
