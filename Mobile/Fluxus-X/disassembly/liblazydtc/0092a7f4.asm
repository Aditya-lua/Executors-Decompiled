; curl_mfprintf @ 0092a7f4
0092a7f4	sub sp,sp,#0x130
0092a7f8	stp x28,x19,[sp, #0x110]
0092a7fc	stp x29,x30,[sp, #0x120]
0092a800	add x29,sp,#0x120
0092a804	stp q6,q7,[sp, #0x70]
0092a808	stp q4,q5,[sp, #0x50]
0092a80c	stp q2,q3,[sp, #0x30]
0092a810	stp q0,q1,[sp, #0x10]
0092a814	stp x6,x7,[sp, #0xb0]
0092a818	stp x4,x5,[sp, #0xa0]
0092a81c	stp x2,x3,[sp, #0x90]
0092a820	mrs x19,tpidr_el0
0092a824	ldr x13,[x19, #0x28]
0092a828	orr x10,xzr,#-0x7f00000080
0092a82c	add x11,sp,#0x10
0092a830	add x12,sp,#0x90
0092a834	movk x10,#0xffd0
0092a838	add x14,x29,#0x10
0092a83c	add x11,x11,#0x80
0092a840	add x12,x12,#0x30
0092a844	sub x9,x29,#0x38
0092a848	str x13,[sp, #0x8]
0092a84c	stp x11,x10,[x29, #-0x28]
0092a850	stp x14,x12,[x29, #-0x38]
0092a854	ldp q1,q0,[x9]
0092a858	mov x8,x1
0092a85c	nop
0092a860	adr x1,0x92a7d4
0092a864	sub x3,x29,#0x60
0092a868	mov x2,x8
0092a86c	stp q1,q0,[x29, #-0x60]
0092a870	bl 0x00929028
0092a874	ldr x8,[x19, #0x28]
0092a878	ldr x9,[sp, #0x8]
0092a87c	cmp x8,x9
0092a880	b.ne 0x0092a894
0092a884	ldp x29,x30,[sp, #0x120]
0092a888	ldp x28,x19,[sp, #0x110]
0092a88c	add sp,sp,#0x130
0092a890	ret
0092a894	bl 0x00c2fec0
