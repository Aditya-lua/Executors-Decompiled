; std::__ndk1::align @ 00bc3260
00bc3260	bti c
00bc3264	ldr x8,[x3]
00bc3268	subs x9,x8,x1
00bc326c	b.cs 0x00bc3278
00bc3270	mov x0,xzr
00bc3274	ret
00bc3278	ldr x10,[x2]
00bc327c	neg x12,x0
00bc3280	add x11,x10,x0
00bc3284	sub x11,x11,#0x1
00bc3288	and x0,x11,x12
00bc328c	sub x10,x0,x10
00bc3290	cmp x10,x9
00bc3294	b.ls 0x00bc32a0
00bc3298	mov x0,xzr
00bc329c	ret
00bc32a0	sub x8,x8,x10
00bc32a4	str x0,[x2]
00bc32a8	str x8,[x3]
00bc32ac	ret
