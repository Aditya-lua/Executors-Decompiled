; cpr::Session::SetConnectTimeout @ 008ee310
008ee310	str x19,[sp, #-0x20]!
008ee314	stp x29,x30,[sp, #0x10]
008ee318	add x29,sp,#0x10
008ee31c	ldr x8,[x0, #0x18]
008ee320	mov x0,x1
008ee324	ldr x19,[x8]
008ee328	bl 0x00c31410
008ee32c	ldp x29,x30,[sp, #0x10]
008ee330	mov w1,#0x9c
008ee334	mov x2,x0
008ee338	mov x0,x19
008ee33c	ldr x19,[sp], #0x20
008ee340	b 0x00c317c0
