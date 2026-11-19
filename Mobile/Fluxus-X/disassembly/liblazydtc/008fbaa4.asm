; cpr::CurlContainer<cpr::Pair>::CurlContainer @ 008fbaa4
008fbaa4	stp x24,x23,[sp, #-0x40]!
008fbaa8	stp x22,x21,[sp, #0x10]
008fbaac	stp x20,x19,[sp, #0x20]
008fbab0	stp x29,x30,[sp, #0x30]
008fbab4	add x29,sp,#0x30
008fbab8	mov w8,#0x1
008fbabc	strb w8,[x0]
008fbac0	ldp x21,x8,[x1]
008fbac4	mov x20,x0
008fbac8	mov x19,x0
008fbacc	str xzr,[x20, #0x8]!
008fbad0	stp xzr,xzr,[x20, #0x8]
008fbad4	cbz x8,0x008fbb28
008fbad8	orr x9,xzr,#0x5555555555555555
008fbadc	movk x9,#0x5556
008fbae0	movk x9,#0x555, LSL #48
008fbae4	cmp x8,x9
008fbae8	b.cs 0x008fbb3c
008fbaec	add x8,x8,x8, LSL #0x1
008fbaf0	lsl x22,x8,#0x4
008fbaf4	mov x0,x22
008fbaf8	bl 0x00c2fed0
008fbafc	add x8,x0,x22
008fbb00	stp x0,x0,[x19, #0x8]
008fbb04	str x8,[x19, #0x18]
008fbb08	mov x1,x21
008fbb0c	bl 0x00c30f20
008fbb10	ldr x8,[x19, #0x10]
008fbb14	add x21,x21,#0x30
008fbb18	subs x22,x22,#0x30
008fbb1c	add x0,x8,#0x30
008fbb20	str x0,[x19, #0x10]
008fbb24	b.ne 0x008fbb08
008fbb28	ldp x29,x30,[sp, #0x30]
008fbb2c	ldp x20,x19,[sp, #0x20]
008fbb30	ldp x22,x21,[sp, #0x10]
008fbb34	ldp x24,x23,[sp], #0x40
008fbb38	ret
008fbb3c	mov x0,x20
008fbb40	bl 0x00c30bd0
