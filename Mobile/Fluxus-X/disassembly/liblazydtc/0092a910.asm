; curl_mvprintf @ 0092a910
0092a910	sub sp,sp,#0x50
0092a914	str x19,[sp, #0x30]
0092a918	stp x29,x30,[sp, #0x40]
0092a91c	add x29,sp,#0x40
0092a920	mrs x19,tpidr_el0
0092a924	ldr x8,[x19, #0x28]
0092a928	mov x2,x0
0092a92c	mov x3,sp
0092a930	stur x8,[x29, #-0x18]
0092a934	ldr q0,[x1, #0x10]
0092a938	adrp x8,0xcb4000
0092a93c	str q0,[sp, #0x10]
0092a940	ldr q0,[x1]
0092a944	nop
0092a948	adr x1,0x92a7d4
0092a94c	str q0,[sp]
0092a950	ldr x8,[x8, #0xba0]
0092a954	add x0,x8,#0x98
0092a958	bl 0x00929028
0092a95c	ldr x8,[x19, #0x28]
0092a960	ldur x9,[x29, #-0x18]
0092a964	cmp x8,x9
0092a968	b.ne 0x0092a97c
0092a96c	ldp x29,x30,[sp, #0x40]
0092a970	ldr x19,[sp, #0x30]
0092a974	add sp,sp,#0x50
0092a978	ret
0092a97c	bl 0x00c2fec0
