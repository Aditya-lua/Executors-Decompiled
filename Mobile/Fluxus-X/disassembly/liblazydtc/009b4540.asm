; SSL_connect @ 009b4540
009b4540	str x19,[sp, #-0x20]!
009b4544	stp x29,x30,[sp, #0x10]
009b4548	ldr x8,[x0, #0x30]
009b454c	mov x19,x0
009b4550	add x29,sp,#0x10
009b4554	cbnz x8,0x009b457c
009b4558	mov x0,x19
009b455c	str wzr,[x19, #0x38]
009b4560	str wzr,[x19, #0x44]
009b4564	bl 0x00c35cd0
009b4568	ldr x8,[x19, #0x8]
009b456c	mov x0,x19
009b4570	ldr x8,[x8, #0x30]
009b4574	str x8,[x19, #0x30]
009b4578	bl 0x009b1b60
009b457c	ldp x29,x30,[sp, #0x10]
009b4580	mov x0,x19
009b4584	ldr x19,[sp], #0x20
009b4588	b 0x009b445c
