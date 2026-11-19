; ssl_hmac_old_init @ 009c8018
009c8018	str x21,[sp, #-0x30]!
009c801c	stp x20,x19,[sp, #0x10]
009c8020	stp x29,x30,[sp, #0x20]
009c8024	ldr x20,[x0, #0x8]
009c8028	mov x0,x3
009c802c	add x29,sp,#0x20
009c8030	mov x19,x2
009c8034	mov x21,x1
009c8038	bl 0x00c35310
009c803c	mov x3,x0
009c8040	mov x0,x20
009c8044	mov w2,w19
009c8048	ldp x29,x30,[sp, #0x20]
009c804c	ldp x20,x19,[sp, #0x10]
009c8050	mov x1,x21
009c8054	mov x4,xzr
009c8058	ldr x21,[sp], #0x30
009c805c	b 0x00c36930
