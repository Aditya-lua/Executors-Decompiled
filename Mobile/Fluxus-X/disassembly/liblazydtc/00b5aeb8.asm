; FUN_00b5aeb8 @ 00b5aeb8
00b5aeb8	stp x28,x27,[sp, #-0x60]!
00b5aebc	stp x26,x25,[sp, #0x10]
00b5aec0	stp x24,x23,[sp, #0x20]
00b5aec4	stp x22,x21,[sp, #0x30]
00b5aec8	stp x20,x19,[sp, #0x40]
00b5aecc	stp x29,x30,[sp, #0x50]
00b5aed0	ldr x26,[x0, #0xf8]
00b5aed4	mov x19,x4
00b5aed8	mov x20,x3
00b5aedc	mov x22,x2
00b5aee0	mov x23,x26
00b5aee4	ldr x25,[x23], #0x68
00b5aee8	mov x21,x0
00b5aeec	mov x24,x1
00b5aef0	add x29,sp,#0x50
00b5aef4	cbz x3,0x00b5af4c
00b5aef8	cbz x19,0x00b5af4c
00b5aefc	mov x0,x26
00b5af00	mov w1,wzr
00b5af04	mov x2,x20
00b5af08	mov x3,x19
00b5af0c	mov x4,xzr
00b5af10	mov x5,xzr
00b5af14	mov x6,xzr
00b5af18	mov x7,xzr
00b5af1c	bl 0x00b5b07c
00b5af20	cbz w0,0x00b5b050
00b5af24	mov w1,#0x1
00b5af28	mov x0,x26
00b5af2c	mov x2,x20
00b5af30	mov x3,x19
00b5af34	mov x4,xzr
00b5af38	mov x5,xzr
00b5af3c	mov x6,xzr
00b5af40	mov x7,xzr
00b5af44	bl 0x00b5b07c
00b5af48	cbz w0,0x00b5b050
00b5af4c	ldr x2,[x26, #0x20]
00b5af50	add x27,x26,#0x28
00b5af54	mov x0,x25
00b5af58	mov x1,x27
00b5af5c	mov x3,xzr
00b5af60	bl 0x00c363d0
00b5af64	cbz w0,0x00b5b050
00b5af68	mov x1,x23
00b5af6c	ldr x2,[x26, #0x20]
00b5af70	mov x0,x25
00b5af74	bl 0x00c363e0
00b5af78	cbz w0,0x00b5b050
00b5af7c	ldr x8,[x26, #0x20]
00b5af80	cmp x22,x8
00b5af84	b.ls 0x00b5afcc
00b5af88	mov x0,x25
00b5af8c	mov x1,x24
00b5af90	mov x2,xzr
00b5af94	mov x3,x22
00b5af98	bl 0x00c363b0
00b5af9c	cbz w0,0x00b5b050
00b5afa0	ldr x2,[x26, #0x20]
00b5afa4	mov x0,x25
00b5afa8	mov x1,x27
00b5afac	mov x3,xzr
00b5afb0	add x28,x24,x2
00b5afb4	sub x22,x22,x2
00b5afb8	bl 0x00c363d0
00b5afbc	mov x1,x24
00b5afc0	mov x24,x28
00b5afc4	cbnz w0,0x00b5af6c
00b5afc8	b 0x00b5b050
00b5afcc	mov w3,#0x40
00b5afd0	mov x0,x25
00b5afd4	mov x1,x23
00b5afd8	mov x2,xzr
00b5afdc	bl 0x00c363b0
00b5afe0	cbz w0,0x00b5b050
00b5afe4	mov x0,x24
00b5afe8	mov x1,x23
00b5afec	mov x2,x22
00b5aff0	bl 0x00c2ffd0
00b5aff4	ldr x22,[x21, #0xf8]
00b5aff8	mov w1,wzr
00b5affc	mov x2,x20
00b5b000	mov x3,x19
00b5b004	mov x0,x22
00b5b008	mov x4,xzr
00b5b00c	mov x5,xzr
00b5b010	mov x6,xzr
00b5b014	mov x7,xzr
00b5b018	bl 0x00b5b07c
00b5b01c	cbz w0,0x00b5b050
00b5b020	cbz x19,0x00b5b074
00b5b024	mov w1,#0x1
00b5b028	mov x0,x22
00b5b02c	mov x2,x20
00b5b030	mov x3,x19
00b5b034	mov x4,xzr
00b5b038	mov x5,xzr
00b5b03c	mov x6,xzr
00b5b040	mov x7,xzr
00b5b044	mov w21,#0x1
00b5b048	bl 0x00b5b07c
00b5b04c	cbnz w0,0x00b5b054
00b5b050	mov w21,wzr
00b5b054	mov w0,w21
00b5b058	ldp x29,x30,[sp, #0x50]
00b5b05c	ldp x20,x19,[sp, #0x40]
00b5b060	ldp x22,x21,[sp, #0x30]
00b5b064	ldp x24,x23,[sp, #0x20]
00b5b068	ldp x26,x25,[sp, #0x10]
00b5b06c	ldp x28,x27,[sp], #0x60
00b5b070	ret
00b5b074	mov w21,#0x1
00b5b078	b 0x00b5b054
