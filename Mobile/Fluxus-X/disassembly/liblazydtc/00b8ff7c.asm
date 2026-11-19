; psa_pake_set_peer @ 00b8ff7c
00b8ff7c	str x23,[sp, #-0x40]!
00b8ff80	stp x22,x21,[sp, #0x10]
00b8ff84	stp x20,x19,[sp, #0x20]
00b8ff88	stp x29,x30,[sp, #0x30]
00b8ff8c	add x29,sp,#0x30
00b8ff90	ldrb w8,[x0, #0xc]
00b8ff94	mov x20,x2
00b8ff98	mov x19,x0
00b8ff9c	mov x21,x1
00b8ffa0	cmp w8,#0x2
00b8ffa4	b.eq 0x00b8ffcc
00b8ffa8	cmp w8,#0x1
00b8ffac	b.ne 0x00b8fff4
00b8ffb0	cbz x20,0x00b8fffc
00b8ffb4	ldr x8,[x19, #0x48]
00b8ffb8	cbz x8,0x00b90050
00b8ffbc	mov w20,#0xffffff77
00b8ffc0	ldr x0,[x19, #0x20]
00b8ffc4	cbnz x0,0x00b90008
00b8ffc8	b 0x00b90010
00b8ffcc	ldr w8,[x19]
00b8ffd0	cmp w8,#0x1
00b8ffd4	b.ne 0x00b8fff4
00b8ffd8	add x0,x19,#0x20
00b8ffdc	bl 0x00c430b0
00b8ffe0	ldrb w8,[x19, #0xc]
00b8ffe4	mov w20,#0xffffff77
00b8ffe8	cmp w8,#0x1
00b8ffec	b.eq 0x00b90000
00b8fff0	b 0x00b90028
00b8fff4	mov w20,#0xffffff77
00b8fff8	b 0x00b90028
00b8fffc	mov w20,#0xffffff79
00b90000	ldr x0,[x19, #0x20]
00b90004	cbz x0,0x00b90010
00b90008	ldr x1,[x19, #0x28]
00b9000c	bl 0x00c42230
00b90010	ldr x0,[x19, #0x30]
00b90014	cbz x0,0x00b9001c
00b90018	bl 0x00c30960
00b9001c	ldr x0,[x19, #0x40]
00b90020	cbz x0,0x00b90028
00b90024	bl 0x00c30960
00b90028	mov w2,#0x390
00b9002c	mov x0,x19
00b90030	mov w1,wzr
00b90034	bl 0x00c301c0
00b90038	mov w0,w20
00b9003c	ldp x29,x30,[sp, #0x30]
00b90040	ldp x20,x19,[sp, #0x20]
00b90044	ldp x22,x21,[sp, #0x10]
00b90048	ldr x23,[sp], #0x40
00b9004c	ret
00b90050	mov w0,#0x1
00b90054	mov x1,x20
00b90058	bl 0x00c30a30
00b9005c	str x0,[x19, #0x40]
00b90060	cbz x0,0x00b900b0
00b90064	mov x22,x0
00b90068	mov w1,#0x1
00b9006c	mov x0,x20
00b90070	bl 0x00c30a30
00b90074	mov x23,x0
00b90078	cbz x0,0x00b900b0
00b9007c	mov x0,x23
00b90080	mov x1,x21
00b90084	mov x2,x20
00b90088	bl 0x00c2ffd0
00b9008c	mov x0,x22
00b90090	mov x1,x23
00b90094	mov x2,x20
00b90098	bl 0x00c2ffd0
00b9009c	mov x0,x23
00b900a0	str x20,[x19, #0x48]
00b900a4	bl 0x00c30960
00b900a8	mov w20,wzr
00b900ac	b 0x00b90038
00b900b0	mov w20,#0xffffff73
00b900b4	ldr x0,[x19, #0x20]
00b900b8	cbnz x0,0x00b90008
00b900bc	b 0x00b90010
