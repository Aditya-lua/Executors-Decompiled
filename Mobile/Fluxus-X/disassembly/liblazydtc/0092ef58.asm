; curl_multi_timeout @ 0092ef58
0092ef58	stp x22,x21,[sp, #-0x30]!
0092ef5c	stp x20,x19,[sp, #0x10]
0092ef60	stp x29,x30,[sp, #0x20]
0092ef64	add x29,sp,#0x20
0092ef68	mov x19,x1
0092ef6c	mov x22,x0
0092ef70	cbz x0,0x0092f000
0092ef74	ldr w8,[x22]
0092ef78	mov w9,#0xab1e
0092ef7c	movk w9,#0xb, LSL #16
0092ef80	cmp w8,w9
0092ef84	b.ne 0x0092f000
0092ef88	ldrb w8,[x22, #0x231]
0092ef8c	tbnz w8,#0x2,0x0092f014
0092ef90	mov x9,xzr
0092ef94	tbnz w8,#0x4,0x0092f020
0092ef98	ldr x8,[x22, #0xd0]
0092ef9c	cbz x8,0x0092f01c
0092efa0	bl 0x00941cb8
0092efa4	ldr x2,[x22, #0xd0]
0092efa8	mov x20,x0
0092efac	mov x21,x1
0092efb0	mov x0,xzr
0092efb4	mov x1,xzr
0092efb8	bl 0x00941308
0092efbc	str x0,[x22, #0xd0]
0092efc0	ldr x8,[x0, #0x20]
0092efc4	mov x9,xzr
0092efc8	cmp x8,x20
0092efcc	b.lt 0x0092f020
0092efd0	b.gt 0x0092efe4
0092efd4	ldr w9,[x0, #0x28]
0092efd8	cmp w9,w21
0092efdc	mov x9,xzr
0092efe0	b.le 0x0092f020
0092efe4	ldr x1,[x0, #0x28]
0092efe8	mov x0,x8
0092efec	mov x2,x20
0092eff0	mov x3,x21
0092eff4	bl 0x00941dc4
0092eff8	mov x9,x0
0092effc	b 0x0092f020
0092f000	mov w0,#0x1
0092f004	ldp x29,x30,[sp, #0x20]
0092f008	ldp x20,x19,[sp, #0x10]
0092f00c	ldp x22,x21,[sp], #0x30
0092f010	ret
0092f014	mov w0,#0x8
0092f018	b 0x0092f004
0092f01c	mov x9,#-0x1
0092f020	mov w0,wzr
0092f024	str x9,[x19]
0092f028	b 0x0092f004
