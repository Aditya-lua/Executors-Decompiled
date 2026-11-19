; SSL_set_connect_state @ 009b458c
009b458c	str x19,[sp, #-0x20]!
009b4590	stp x29,x30,[sp, #0x10]
009b4594	add x29,sp,#0x10
009b4598	mov x19,x0
009b459c	str wzr,[x0, #0x38]
009b45a0	str wzr,[x0, #0x44]
009b45a4	bl 0x00c35cd0
009b45a8	ldr x8,[x19, #0x8]
009b45ac	mov x0,x19
009b45b0	ldr x8,[x8, #0x30]
009b45b4	str x8,[x19, #0x30]
009b45b8	ldp x29,x30,[sp, #0x10]
009b45bc	ldr x19,[sp], #0x20
009b45c0	b 0x009b1b60
