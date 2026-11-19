; X509_load_http @ 00b158cc
00b158cc	sub sp,sp,#0x70
00b158d0	str x23,[sp, #0x30]
00b158d4	stp x22,x21,[sp, #0x40]
00b158d8	stp x20,x19,[sp, #0x50]
00b158dc	stp x29,x30,[sp, #0x60]
00b158e0	add x29,sp,#0x60
00b158e4	mov w19,w3
00b158e8	mov x20,x2
00b158ec	mov x21,x1
00b158f0	mov x22,x0
00b158f4	bl 0x00c36190
00b158f8	mov w8,#0x9000
00b158fc	mov x23,x0
00b15900	movk w8,#0x1, LSL #16
00b15904	mov w9,#0x1
00b15908	mov w7,#0x400
00b1590c	mov x0,x22
00b15910	mov x1,xzr
00b15914	mov x2,xzr
00b15918	mov x3,x21
00b1591c	mov x4,x20
00b15920	mov x5,xzr
00b15924	mov x6,xzr
00b15928	stp xzr,xzr,[sp]
00b1592c	str w19,[sp, #0x20]
00b15930	str x8,[sp, #0x18]
00b15934	str w9,[sp, #0x10]
00b15938	bl 0x00c3dd60
00b1593c	mov x19,x0
00b15940	mov x0,x23
00b15944	mov x1,x19
00b15948	mov x2,xzr
00b1594c	bl 0x00c37420
00b15950	mov x20,x0
00b15954	mov x0,x19
00b15958	bl 0x00c31a40
00b1595c	mov x0,x20
00b15960	ldp x29,x30,[sp, #0x60]
00b15964	ldp x20,x19,[sp, #0x50]
00b15968	ldp x22,x21,[sp, #0x40]
00b1596c	ldr x23,[sp, #0x30]
00b15970	add sp,sp,#0x70
00b15974	ret
