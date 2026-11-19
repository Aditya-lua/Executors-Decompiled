; SSL_set_accept_state @ 009b4420
009b4420	str x19,[sp, #-0x20]!
009b4424	mov w8,#0x1
009b4428	stp x29,x30,[sp, #0x10]
009b442c	add x29,sp,#0x10
009b4430	mov x19,x0
009b4434	str w8,[x0, #0x38]
009b4438	str wzr,[x0, #0x44]
009b443c	bl 0x00c35cd0
009b4440	ldr x8,[x19, #0x8]
009b4444	mov x0,x19
009b4448	ldr x8,[x8, #0x28]
009b444c	str x8,[x19, #0x30]
009b4450	ldp x29,x30,[sp, #0x10]
009b4454	ldr x19,[sp], #0x20
009b4458	b 0x009b1b60
