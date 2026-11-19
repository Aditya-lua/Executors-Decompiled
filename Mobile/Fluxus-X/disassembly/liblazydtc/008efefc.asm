; cpr::Session::PrepareHead @ 008efefc
008efefc	str x19,[sp, #-0x20]!
008eff00	stp x29,x30,[sp, #0x10]
008eff04	add x29,sp,#0x10
008eff08	ldr x8,[x0, #0x18]
008eff0c	mov x19,x0
008eff10	mov w1,#0x2c
008eff14	mov w2,#0x1
008eff18	ldr x0,[x8]
008eff1c	bl 0x00c317c0
008eff20	ldr x8,[x19, #0x18]
008eff24	mov w1,#0x2734
008eff28	mov x2,xzr
008eff2c	ldr x0,[x8]
008eff30	bl 0x00c317c0
008eff34	ldp x29,x30,[sp, #0x10]
008eff38	mov x0,x19
008eff3c	ldr x19,[sp], #0x20
008eff40	b 0x00c31270
