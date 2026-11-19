; FUN_008bd898 @ 008bd898
008bd898	sub sp,sp,#0x40
008bd89c	stp x29,x30,[sp, #0x10]
008bd8a0	stp x22,x21,[sp, #0x20]
008bd8a4	stp x20,x19,[sp, #0x30]
008bd8a8	add x29,sp,#0x10
008bd8ac	mov x21,x2
008bd8b0	mov x19,x1
008bd8b4	mov x20,x0
008bd8b8	tbz w3,#0x0,0x008bd8f8
008bd8bc	ldr w8,[x21, #0xc]
008bd8c0	cmp w8,#0x3
008bd8c4	b.ne 0x008bd8f8
008bd8c8	ldr d0,[x21]
008bd8cc	fcvtzs w8,d0
008bd8d0	scvtf d1,w8
008bd8d4	fcmp d0,d1
008bd8d8	b.ne 0x008bd8f8
008bd8dc	ldr w9,[x19, #0x8]
008bd8e0	sub w8,w8,#0x1
008bd8e4	cmp w8,w9
008bd8e8	b.cs 0x008bd8f8
008bd8ec	ldr x9,[x19, #0x20]
008bd8f0	add x0,x9,w8, SXTW  #0x4
008bd8f4	b 0x008bd9d4
008bd8f8	mov x0,x19
008bd8fc	mov x1,x21
008bd900	bl 0x008bd784
008bd904	ldr w8,[x0, #0xc]
008bd908	cbz w8,0x008bd954
008bd90c	ldr w8,[x19, #0xc]
008bd910	cmp w8,#0x1
008bd914	b.lt 0x008bd940
008bd918	sub x8,x8,#0x1
008bd91c	ldr x9,[x19, #0x28]
008bd920	mov w10,w8
008bd924	str w8,[x19, #0xc]
008bd928	add x2,x9,x10, LSL #0x5
008bd92c	ldrb w9,[x2, #0x1c]
008bd930	tst w9,#0xf
008bd934	b.ne 0x008bd910
008bd938	mov x1,x0
008bd93c	b 0x008bd948
008bd940	mov x1,x0
008bd944	mov x2,xzr
008bd948	mov x0,x19
008bd94c	bl 0x008bda50
008bd950	b 0x008bd97c
008bd954	adrp x8,0xd1f000
008bd958	add x8,x8,#0xc90
008bd95c	adrp x9,0xd1f000
008bd960	ldarb w8,[x8]
008bd964	tbz w8,#0x0,0x008bd9e8
008bd968	ldr x8,[x9, #0xc88]
008bd96c	add x8,x8,#0x7f3, LSL #12
008bd970	add x8,x8,#0x700
008bd974	cmp x0,x8
008bd978	b.eq 0x008bd90c
008bd97c	ldr x8,[x21]
008bd980	ldr w9,[x0, #0x1c]
008bd984	str x8,[x0, #0x10]
008bd988	ldr w8,[x21, #0x8]
008bd98c	str w8,[x0, #0x18]
008bd990	ldr w8,[x21, #0xc]
008bd994	bfxil w9,w8,#0x0,#0x4
008bd998	str w9,[x0, #0x1c]
008bd99c	ldr w8,[x21, #0xc]
008bd9a0	cmp w8,#0x5
008bd9a4	b.lt 0x008bd9d4
008bd9a8	ldrb w8,[x19, #0x2]
008bd9ac	tbz w8,#0x2,0x008bd9d4
008bd9b0	ldr x2,[x21]
008bd9b4	ldrb w8,[x2, #0x2]
008bd9b8	tst w8,#0x3
008bd9bc	b.eq 0x008bd9d4
008bd9c0	mov x21,x0
008bd9c4	mov x0,x20
008bd9c8	mov x1,x19
008bd9cc	bl 0x008b6370
008bd9d0	mov x0,x21
008bd9d4	ldp x20,x19,[sp, #0x30]
008bd9d8	ldp x22,x21,[sp, #0x20]
008bd9dc	ldp x29,x30,[sp, #0x10]
008bd9e0	add sp,sp,#0x40
008bd9e4	ret
008bd9e8	adrp x8,0xd1f000
008bd9ec	add x8,x8,#0xc90
008bd9f0	str x0,[sp, #0x8]
008bd9f4	mov x0,x8
008bd9f8	bl 0x00c2fe90
008bd9fc	mov w8,w0
008bda00	ldr x0,[sp, #0x8]
008bda04	adrp x9,0xd1f000
008bda08	cbz w8,0x008bd968
008bda0c	adrp x8,0xcca000
008bda10	ldr x0,[x8, #0x8c8]
008bda14	bl 0x007fe1ec
008bda18	adrp x22,0xd1f000
008bda1c	str x0,[x22, #0xc88]
008bda20	adrp x0,0xd1f000
008bda24	add x0,x0,#0xc90
008bda28	bl 0x00c2fea0
008bda2c	ldr x0,[sp, #0x8]
008bda30	mov x9,x22
008bda34	b 0x008bd968
