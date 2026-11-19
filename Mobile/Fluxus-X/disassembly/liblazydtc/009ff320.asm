; BIO_sock_error @ 009ff320
009ff320	str x19,[sp, #-0x20]!
009ff324	stp x29,x30,[sp, #0x10]
009ff328	add x29,sp,#0x10
009ff32c	mov w8,#0x4
009ff330	mov w1,#0x1
009ff334	mov w2,#0x4
009ff338	sub x3,x29,#0x4
009ff33c	add x4,sp,#0x8
009ff340	stur wzr,[x29, #-0x4]
009ff344	str w8,[sp, #0x8]
009ff348	sub x19,x29,#0x4
009ff34c	bl 0x00c31c30
009ff350	tbz w0,#0x1f,0x009ff35c
009ff354	bl 0x00c30710
009ff358	mov x19,x0
009ff35c	ldr w0,[x19]
009ff360	ldp x29,x30,[sp, #0x10]
009ff364	ldr x19,[sp], #0x20
009ff368	ret
