; FUN_00a4ddd0 @ 00a4ddd0
00a4ddd0	stp x28,x27,[sp, #-0x60]!
00a4ddd4	stp x20,x19,[sp, #0x40]
00a4ddd8	mov w19,wzr
00a4dddc	stp x26,x25,[sp, #0x10]
00a4dde0	stp x24,x23,[sp, #0x20]
00a4dde4	stp x22,x21,[sp, #0x30]
00a4dde8	stp x29,x30,[sp, #0x50]
00a4ddec	add x29,sp,#0x50
00a4ddf0	cbz x1,0x00a4df18
00a4ddf4	mov w21,w2
00a4ddf8	cbz w2,0x00a4df18
00a4ddfc	ldr x26,[x0, #0x40]
00a4de00	mov x20,x0
00a4de04	cbz x26,0x00a4df14
00a4de08	ldr x8,[x20, #0x48]
00a4de0c	cbz x8,0x00a4df14
00a4de10	mov x22,x1
00a4de14	orr w1,wzr,#0xf
00a4de18	mov x0,x20
00a4de1c	bl 0x00c32190
00a4de20	ldr w24,[x26, #0x10]
00a4de24	adrp x23,0x2b4000
00a4de28	mov w19,wzr
00a4de2c	orr w27,wzr,#0x1ffe
00a4de30	add x23,x23,#0x201
00a4de34	cbnz w24,0x00a4de44
00a4de38	b 0x00a4de90
00a4de3c	str w24,[x26, #0x10]
00a4de40	cbz w24,0x00a4de90
00a4de44	ldr x8,[x26, #0x8]
00a4de48	ldrsw x9,[x26, #0x14]
00a4de4c	cmp w24,w21
00a4de50	csel w28,w21,w24,gt
00a4de54	sxtw x25,w28
00a4de58	add x1,x8,x9
00a4de5c	mov x0,x22
00a4de60	mov x2,x25
00a4de64	bl 0x00c2ffd0
00a4de68	ldp w10,w8,[x26, #0x10]
00a4de6c	cmp w21,w24
00a4de70	add w19,w28,w19
00a4de74	add w9,w8,w28
00a4de78	sub w8,w10,w28
00a4de7c	stp w8,w9,[x26, #0x10]
00a4de80	b.le 0x00a4df18
00a4de84	sub w21,w21,w25
00a4de88	add x22,x22,x25
00a4de8c	b 0x00a4de94
00a4de90	ldr w9,[x26, #0x14]
00a4de94	add w8,w21,w9
00a4de98	ldr w10,[x26]
00a4de9c	add w11,w8,#0xfff
00a4dea0	add w8,w8,w27
00a4dea4	cmp w11,#0x0
00a4dea8	ldr x0,[x26, #0x8]
00a4deac	csel w8,w8,w11,lt
00a4deb0	and w24,w8,#0xfffff000
00a4deb4	cmp w24,w10
00a4deb8	b.le 0x00a4dedc
00a4debc	sxtw x1,w24
00a4dec0	mov w3,#0x61
00a4dec4	mov x2,x23
00a4dec8	bl 0x00c356f0
00a4decc	cbz x0,0x00a4df14
00a4ded0	ldr w9,[x26, #0x14]
00a4ded4	str x0,[x26, #0x8]
00a4ded8	str w24,[x26]
00a4dedc	ldr x8,[x20, #0x48]
00a4dee0	add x1,x0,w9, SXTW 
00a4dee4	mov w2,w21
00a4dee8	mov x0,x8
00a4deec	bl 0x00c34220
00a4def0	mov w24,w0
00a4def4	cmp w0,#0x0
00a4def8	b.gt 0x00a4de3c
00a4defc	mov x0,x20
00a4df00	bl 0x00c38460
00a4df04	tbz w24,#0x1f,0x00a4df18
00a4df08	cmp w19,#0x0
00a4df0c	csel w19,w19,w24,gt
00a4df10	b 0x00a4df18
00a4df14	mov w19,wzr
00a4df18	mov w0,w19
00a4df1c	ldp x29,x30,[sp, #0x50]
00a4df20	ldp x20,x19,[sp, #0x40]
00a4df24	ldp x22,x21,[sp, #0x30]
00a4df28	ldp x24,x23,[sp, #0x20]
00a4df2c	ldp x26,x25,[sp, #0x10]
00a4df30	ldp x28,x27,[sp], #0x60
00a4df34	ret
