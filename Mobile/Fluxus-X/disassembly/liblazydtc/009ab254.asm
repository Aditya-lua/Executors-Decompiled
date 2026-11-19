; ssl3_free_digest_list @ 009ab254
009ab254	str x19,[sp, #-0x20]!
009ab258	stp x29,x30,[sp, #0x10]
009ab25c	mov x19,x0
009ab260	ldr x0,[x0, #0x188]
009ab264	add x29,sp,#0x10
009ab268	bl 0x00c31a40
009ab26c	ldr x0,[x19, #0x190]
009ab270	str xzr,[x19, #0x188]
009ab274	bl 0x00c31f90
009ab278	str xzr,[x19, #0x190]
009ab27c	ldp x29,x30,[sp, #0x10]
009ab280	ldr x19,[sp], #0x20
009ab284	ret
