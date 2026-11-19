; ASN1_INTEGER_set_uint64 @ 009f351c
009f351c	sub sp,sp,#0x20
009f3520	mov w9,#0x2
009f3524	stp x29,x30,[sp, #0x10]
009f3528	mov x8,xzr
009f352c	str w9,[x0, #0x4]
009f3530	add x9,sp,#0x8
009f3534	add x29,sp,#0x10
009f3538	add x10,x9,x8
009f353c	strb w1,[x10, #0x7]
009f3540	lsr x1,x1,#0x8
009f3544	sub x8,x8,#0x1
009f3548	cbnz x1,0x009f3538
009f354c	add x9,sp,#0x8
009f3550	add x9,x9,x8
009f3554	add x1,x9,#0x8
009f3558	neg w2,w8
009f355c	bl 0x00c378a0
009f3560	ldp x29,x30,[sp, #0x10]
009f3564	add sp,sp,#0x20
009f3568	ret
