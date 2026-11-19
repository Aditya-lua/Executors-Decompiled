; FUN_0095fd58 @ 0095fd58
0095fd58	sub sp,sp,#0x150
0095fd5c	str x28,[sp, #0x110]
0095fd60	stp x22,x21,[sp, #0x120]
0095fd64	stp x20,x19,[sp, #0x130]
0095fd68	stp x29,x30,[sp, #0x140]
0095fd6c	add x29,sp,#0x140
0095fd70	mrs x22,tpidr_el0
0095fd74	ldr x8,[x22, #0x28]
0095fd78	mov x20,x0
0095fd7c	stur x8,[x29, #-0x38]
0095fd80	ldr x19,[x0, #0x10]
0095fd84	sub w8,w1,#0x3
0095fd88	cmp w8,#0x4
0095fd8c	b.hi 0x0095ff74
0095fd90	adrp x9,0x749000
0095fd94	add x9,x9,#0x2c
0095fd98	ldrsw x8,[x9, x8, LSL #0x2]
0095fd9c	add x8,x8,x9
0095fda0	br x8
0095fda4	ldr x8,[x20, #0x148]
0095fda8	ldrh w9,[x20, #0x144]
0095fdac	ldrh w10,[x8, #0x2]
0095fdb0	add w8,w9,#0x1
0095fdb4	rev w10,w10
0095fdb8	lsr w21,w10,#0x10
0095fdbc	and w10,w8,#0xffff
0095fdc0	cmp w10,w21
0095fdc4	b.ne 0x0095ff94
0095fdc8	str wzr,[x20, #0x1c]
0095fdcc	ldr x8,[x20, #0x150]
0095fdd0	strh w21,[x20, #0x144]
0095fdd4	mov w9,#0x4
0095fdd8	add x4,x20,#0xb0
0095fddc	strb wzr,[x8]
0095fde0	ldr x8,[x20, #0x150]
0095fde4	mov w2,#0x4
0095fde8	mov w3,#0x4000
0095fdec	strb w9,[x8, #0x1]
0095fdf0	ldrh w8,[x20, #0x144]
0095fdf4	ldr x9,[x20, #0x150]
0095fdf8	lsr w10,w8,#0x8
0095fdfc	strb w10,[x9, #0x2]
0095fe00	ldr x9,[x20, #0x150]
0095fe04	strb w8,[x9, #0x3]
0095fe08	ldr w0,[x20, #0x18]
0095fe0c	ldr x1,[x20, #0x150]
0095fe10	ldr w5,[x20, #0x130]
0095fe14	bl 0x00c320d0
0095fe18	tbnz x0,#0x3f,0x0095fffc
0095fe1c	ldrsw x8,[x20, #0x13c]
0095fe20	ldrsw x9,[x20, #0x134]
0095fe24	add x8,x8,#0x4
0095fe28	cmp x8,x9
0095fe2c	orr w8,wzr,#0x3
0095fe30	csinc w8,w8,wzr,gt
0095fe34	b 0x0095fe90
0095fe38	ldr x8,[x20, #0x150]
0095fe3c	strh wzr,[x20, #0x144]
0095fe40	str wzr,[x20, #0x1c]
0095fe44	mov w9,#0x4
0095fe48	strb wzr,[x8]
0095fe4c	ldr x8,[x20, #0x150]
0095fe50	add x4,x20,#0xb0
0095fe54	mov w2,#0x4
0095fe58	mov w3,#0x4000
0095fe5c	strb w9,[x8, #0x1]
0095fe60	ldrh w8,[x20, #0x144]
0095fe64	ldr x9,[x20, #0x150]
0095fe68	lsr w10,w8,#0x8
0095fe6c	strb w10,[x9, #0x2]
0095fe70	ldr x9,[x20, #0x150]
0095fe74	strb w8,[x9, #0x3]
0095fe78	ldr w0,[x20, #0x18]
0095fe7c	ldr x1,[x20, #0x150]
0095fe80	ldr w5,[x20, #0x130]
0095fe84	bl 0x00c320d0
0095fe88	tbnz x0,#0x3f,0x0095fffc
0095fe8c	mov w8,#0x1
0095fe90	mov x0,xzr
0095fe94	str w8,[x20]
0095fe98	bl 0x00c30970
0095fe9c	mov x8,x0
0095fea0	mov w0,wzr
0095fea4	str x8,[x20, #0x28]
0095fea8	b 0x00960028
0095feac	ldr x8,[x20, #0x150]
0095feb0	mov w9,#0x5
0095feb4	add x4,x20,#0xb0
0095feb8	mov w2,#0x4
0095febc	strb wzr,[x8]
0095fec0	ldr x8,[x20, #0x150]
0095fec4	mov w3,#0x4000
0095fec8	strb w9,[x8, #0x1]
0095fecc	ldrh w8,[x20, #0x144]
0095fed0	ldr x9,[x20, #0x150]
0095fed4	lsr w10,w8,#0x8
0095fed8	strb w10,[x9, #0x2]
0095fedc	ldr x9,[x20, #0x150]
0095fee0	strb w8,[x9, #0x3]
0095fee4	ldr w0,[x20, #0x18]
0095fee8	ldr x1,[x20, #0x150]
0095feec	ldr w5,[x20, #0x130]
0095fef0	bl 0x00c320d0
0095fef4	orr w8,wzr,#0x3
0095fef8	mov w0,wzr
0095fefc	str w8,[x20]
0095ff00	b 0x00960028
0095ff04	ldr w8,[x20, #0x1c]
0095ff08	add w3,w8,#0x1
0095ff0c	str w3,[x20, #0x1c]
0095ff10	cbz x19,0x0095ff50
0095ff14	ldrb w8,[x19, #0xa85]
0095ff18	tbz w8,#0x4,0x0095ff50
0095ff1c	ldr x8,[x19, #0x12a0]
0095ff20	cbz x8,0x0095ff30
0095ff24	ldr w8,[x8, #0x8]
0095ff28	cmp w8,#0x1
0095ff2c	b.lt 0x0095ff50
0095ff30	ldrh w8,[x20, #0x144]
0095ff34	adrp x1,0x2b1000
0095ff38	add x1,x1,#0x87b
0095ff3c	mov x0,x19
0095ff40	add w8,w8,#0x1
0095ff44	and w2,w8,#0xffff
0095ff48	bl 0x00904c98
0095ff4c	ldr w3,[x20, #0x1c]
0095ff50	ldr w8,[x20, #0x24]
0095ff54	cmp w3,w8
0095ff58	b.le 0x0095ffd4
0095ff5c	mov w8,#0xffffff9d
0095ff60	orr w9,wzr,#0x3
0095ff64	mov w0,wzr
0095ff68	str w8,[x20, #0x8]
0095ff6c	str w9,[x20]
0095ff70	b 0x00960028
0095ff74	adrp x1,0x2b6000
0095ff78	adrp x2,0x2b7000
0095ff7c	add x1,x1,#0xc62
0095ff80	add x2,x2,#0x177
0095ff84	mov x0,x19
0095ff88	bl 0x00904b80
0095ff8c	mov w0,#0x47
0095ff90	b 0x00960028
0095ff94	cmp w9,w21
0095ff98	b.ne 0x00960050
0095ff9c	cbz x19,0x0095fdcc
0095ffa0	ldrb w8,[x19, #0xa85]
0095ffa4	tbz w8,#0x4,0x0095fdcc
0095ffa8	ldr x8,[x19, #0x12a0]
0095ffac	cbz x8,0x0095ffbc
0095ffb0	ldr w8,[x8, #0x8]
0095ffb4	cmp w8,#0x1
0095ffb8	b.lt 0x0095fdcc
0095ffbc	adrp x1,0x2af000
0095ffc0	add x1,x1,#0x59c
0095ffc4	mov x0,x19
0095ffc8	mov w2,w21
0095ffcc	bl 0x00904c98
0095ffd0	b 0x0095fdcc
0095ffd4	ldr w0,[x20, #0x18]
0095ffd8	ldr x1,[x20, #0x150]
0095ffdc	ldr w5,[x20, #0x130]
0095ffe0	add x4,x20,#0xb0
0095ffe4	mov w2,#0x4
0095ffe8	mov w3,#0x4000
0095ffec	bl 0x00c320d0
0095fff0	mov x8,x0
0095fff4	mov w0,wzr
0095fff8	tbz x8,#0x3f,0x00960028
0095fffc	bl 0x00c30710
00960000	ldr w0,[x0]
00960004	add x1,sp,#0x8
00960008	mov w2,#0x100
0096000c	bl 0x00941a94
00960010	adrp x1,0x2b6000
00960014	mov x2,x0
00960018	add x1,x1,#0xc62
0096001c	mov x0,x19
00960020	bl 0x00904b80
00960024	mov w0,#0x37
00960028	ldr x8,[x22, #0x28]
0096002c	ldur x9,[x29, #-0x38]
00960030	cmp x8,x9
00960034	b.ne 0x00960094
00960038	ldp x29,x30,[sp, #0x140]
0096003c	ldp x20,x19,[sp, #0x130]
00960040	ldp x22,x21,[sp, #0x120]
00960044	ldr x28,[sp, #0x110]
00960048	add sp,sp,#0x150
0096004c	ret
00960050	cbz x19,0x0096008c
00960054	ldrb w9,[x19, #0xa85]
00960058	mov w0,wzr
0096005c	tbz w9,#0x4,0x00960028
00960060	ldr x9,[x19, #0x12a0]
00960064	cbz x9,0x00960074
00960068	ldr w9,[x9, #0x8]
0096006c	cmp w9,#0x1
00960070	b.lt 0x0096008c
00960074	adrp x1,0x2d7000
00960078	and w3,w8,#0xffff
0096007c	add x1,x1,#0x5c9
00960080	mov x0,x19
00960084	mov w2,w21
00960088	bl 0x00904c98
0096008c	mov w0,wzr
00960090	b 0x00960028
00960094	bl 0x00c2fec0
