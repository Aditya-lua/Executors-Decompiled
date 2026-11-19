; FUN_008ab8a4 @ 008ab8a4
008ab8a4	stp x29,x30,[sp, #-0x30]!
008ab8a8	stp x22,x21,[sp, #0x10]
008ab8ac	stp x20,x19,[sp, #0x20]
008ab8b0	mov x29,sp
008ab8b4	mov x19,x2
008ab8b8	mov w20,w1
008ab8bc	cmp w1,#0x1
008ab8c0	mov x21,x0
008ab8c4	b.lt 0x008ab900
008ab8c8	ldp x9,x8,[x21, #0x68]
008ab8cc	add x8,x8,w20, UXTW  #0x4
008ab8d0	sub x22,x8,#0x10
008ab8d4	cmp x22,x9
008ab8d8	b.cc 0x008ab928
008ab8dc	adrp x8,0xd1f000
008ab8e0	add x8,x8,#0x1e0
008ab8e4	ldarb w8,[x8]
008ab8e8	tbz w8,#0x0,0x008aba1c
008ab8ec	adrp x8,0xd1f000
008ab8f0	ldr x8,[x8, #0x1d8]
008ab8f4	add x8,x8,#0x7f2, LSL #12
008ab8f8	add x22,x8,#0xef0
008ab8fc	b 0x008ab928
008ab900	mov w8,#0xffffd8f1
008ab904	cmp w20,w8
008ab908	b.lt 0x008ab918
008ab90c	ldr x8,[x21, #0x68]
008ab910	add x22,x8,w20, SXTW  #0x4
008ab914	b 0x008ab928
008ab918	mov x0,x21
008ab91c	mov w1,w20
008ab920	bl 0x008aea7c
008ab924	mov x22,x0
008ab928	ldr w8,[x22, #0xc]
008ab92c	cmp w8,#0x5
008ab930	b.ne 0x008ab95c
008ab934	cbz x19,0x008ab944
008ab938	ldr x8,[x22]
008ab93c	ldr w8,[x8, #0x14]
008ab940	str x8,[x19]
008ab944	ldr x8,[x22]
008ab948	add x0,x8,#0x18
008ab94c	ldp x20,x19,[sp, #0x20]
008ab950	ldp x22,x21,[sp, #0x10]
008ab954	ldp x29,x30,[sp], #0x30
008ab958	ret
008ab95c	ldrb w8,[x21, #0x2]
008ab960	tbz w8,#0x2,0x008ab974
008ab964	add x2,x21,#0x38
008ab968	mov x0,x21
008ab96c	mov x1,x21
008ab970	bl 0x008b63a4
008ab974	mov x0,x21
008ab978	mov x1,x22
008ab97c	bl 0x008cad40
008ab980	cbz w0,0x008ab9e0
008ab984	ldr x8,[x21, #0x60]
008ab988	ldp x8,x9,[x8, #0x8]
008ab98c	cmp x9,x8
008ab990	b.cc 0x008ab9a0
008ab994	mov x0,x21
008ab998	mov w1,#0x1
008ab99c	bl 0x008b52c4
008ab9a0	cmp w20,#0x1
008ab9a4	b.lt 0x008ab9f0
008ab9a8	ldp x9,x8,[x21, #0x68]
008ab9ac	add x8,x8,w20, UXTW  #0x4
008ab9b0	sub x22,x8,#0x10
008ab9b4	cmp x22,x9
008ab9b8	b.cc 0x008ab934
008ab9bc	adrp x8,0xd1f000
008ab9c0	add x8,x8,#0x1e0
008ab9c4	adrp x20,0xd1f000
008ab9c8	ldarb w8,[x8]
008ab9cc	tbz w8,#0x0,0x008aba50
008ab9d0	ldr x8,[x20, #0x1d8]
008ab9d4	add x8,x8,#0x7f2, LSL #12
008ab9d8	add x22,x8,#0xef0
008ab9dc	b 0x008ab934
008ab9e0	mov x0,xzr
008ab9e4	cbz x19,0x008ab94c
008ab9e8	str xzr,[x19]
008ab9ec	b 0x008ab94c
008ab9f0	mov w8,#0xffffd8f1
008ab9f4	cmp w20,w8
008ab9f8	b.lt 0x008aba08
008ab9fc	ldr x8,[x21, #0x68]
008aba00	add x22,x8,w20, SXTW  #0x4
008aba04	b 0x008ab934
008aba08	mov x0,x21
008aba0c	mov w1,w20
008aba10	bl 0x008aea7c
008aba14	mov x22,x0
008aba18	b 0x008ab934
008aba1c	adrp x0,0xd1f000
008aba20	add x0,x0,#0x1e0
008aba24	bl 0x00c2fe90
008aba28	cbz w0,0x008ab8ec
008aba2c	adrp x8,0xcca000
008aba30	ldr x0,[x8, #0x8c8]
008aba34	bl 0x007fe1ec
008aba38	adrp x8,0xd1f000
008aba3c	str x0,[x8, #0x1d8]
008aba40	adrp x0,0xd1f000
008aba44	add x0,x0,#0x1e0
008aba48	bl 0x00c2fea0
008aba4c	b 0x008ab8ec
008aba50	adrp x0,0xd1f000
008aba54	add x0,x0,#0x1e0
008aba58	bl 0x00c2fe90
008aba5c	cbz w0,0x008ab9d0
008aba60	adrp x8,0xcca000
008aba64	ldr x0,[x8, #0x8c8]
008aba68	bl 0x007fe1ec
008aba6c	str x0,[x20, #0x1d8]
008aba70	adrp x0,0xd1f000
008aba74	add x0,x0,#0x1e0
008aba78	bl 0x00c2fea0
008aba7c	b 0x008ab9d0
