; FUN_00a8ffac @ 00a8ffac
00a8ffac	sub sp,sp,#0x80
00a8ffb0	stp x24,x23,[sp, #0x40]
00a8ffb4	stp x22,x21,[sp, #0x50]
00a8ffb8	stp x20,x19,[sp, #0x60]
00a8ffbc	mov x20,x3
00a8ffc0	mov x23,x2
00a8ffc4	mov x21,x1
00a8ffc8	lsr x8,x3,#0x1e
00a8ffcc	mov x19,x0
00a8ffd0	stp x28,x27,[sp, #0x20]
00a8ffd4	stp x26,x25,[sp, #0x30]
00a8ffd8	stp x29,x30,[sp, #0x70]
00a8ffdc	add x29,sp,#0x70
00a8ffe0	cbz x8,0x00a90068
00a8ffe4	orr x27,xzr,#-0x40000000
00a8ffe8	add x8,x20,x27
00a8ffec	and x28,x8,#-0x40000000
00a8fff0	mov w26,#0x40000000
00a8fff4	add x22,x28,x26
00a8fff8	add x24,x19,#0x28
00a8fffc	str x8,[sp, #0x8]
00a90000	add x8,x23,x22
00a90004	mov x25,x21
00a90008	str x8,[sp, #0x10]
00a9000c	mov x0,x19
00a90010	bl 0x00c3ceb0
00a90014	str w0,[sp, #0x1c]
00a90018	mov x0,x19
00a9001c	bl 0x00c3cea0
00a90020	mov x3,x0
00a90024	mov w2,#0x40000000
00a90028	add x5,sp,#0x1c
00a9002c	mov x0,x23
00a90030	mov x1,x25
00a90034	mov x4,x24
00a90038	bl 0x00c392c0
00a9003c	ldr w1,[sp, #0x1c]
00a90040	mov x0,x19
00a90044	bl 0x00c3ced0
00a90048	add x20,x20,x27
00a9004c	add x23,x23,x26
00a90050	lsr x8,x20,#0x1e
00a90054	add x25,x25,x26
00a90058	cbnz x8,0x00a9000c
00a9005c	ldp x8,x23,[sp, #0x8]
00a90060	add x21,x21,x22
00a90064	sub x20,x8,x28
00a90068	cbz x20,0x00a900a8
00a9006c	mov x0,x19
00a90070	bl 0x00c3ceb0
00a90074	str w0,[sp, #0x18]
00a90078	mov x0,x19
00a9007c	bl 0x00c3cea0
00a90080	mov x3,x0
00a90084	add x4,x19,#0x28
00a90088	add x5,sp,#0x18
00a9008c	mov x0,x23
00a90090	mov x1,x21
00a90094	mov x2,x20
00a90098	bl 0x00c392c0
00a9009c	ldr w1,[sp, #0x18]
00a900a0	mov x0,x19
00a900a4	bl 0x00c3ced0
00a900a8	ldp x29,x30,[sp, #0x70]
00a900ac	ldp x20,x19,[sp, #0x60]
00a900b0	ldp x22,x21,[sp, #0x50]
00a900b4	ldp x24,x23,[sp, #0x40]
00a900b8	ldp x26,x25,[sp, #0x30]
00a900bc	ldp x28,x27,[sp, #0x20]
00a900c0	mov w0,#0x1
00a900c4	add sp,sp,#0x80
00a900c8	ret
