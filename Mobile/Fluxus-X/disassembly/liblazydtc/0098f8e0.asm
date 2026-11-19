; ix::WebSocket::invokeTrafficTrackerCallback @ 0098f8e0
0098f8e0	sub sp,sp,#0x40
0098f8e4	str x19,[sp, #0x20]
0098f8e8	stp x29,x30,[sp, #0x30]
0098f8ec	add x29,sp,#0x30
0098f8f0	mrs x19,tpidr_el0
0098f8f4	ldr x8,[x19, #0x28]
0098f8f8	str x8,[sp, #0x18]
0098f8fc	adrp x8,0xcb5000
0098f900	ldr x8,[x8, #0x40]
0098f904	ldr x8,[x8, #0x20]
0098f908	cbz x8,0x0098f930
0098f90c	and w9,w1,#0x1
0098f910	str x0,[sp, #0x10]
0098f914	strb w9,[sp, #0xc]
0098f918	ldr x9,[x8]
0098f91c	add x1,sp,#0x10
0098f920	add x2,sp,#0xc
0098f924	mov x0,x8
0098f928	ldr x9,[x9, #0x30]
0098f92c	blr x9
0098f930	ldr x8,[x19, #0x28]
0098f934	ldr x9,[sp, #0x18]
0098f938	cmp x8,x9
0098f93c	b.ne 0x0098f950
0098f940	ldp x29,x30,[sp, #0x30]
0098f944	ldr x19,[sp, #0x20]
0098f948	add sp,sp,#0x40
0098f94c	ret
0098f950	bl 0x00c2fec0
