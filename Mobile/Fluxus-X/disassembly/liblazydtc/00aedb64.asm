; UI_add_verify_string @ 00aedb64
00aedb64	str x23,[sp, #-0x40]!
00aedb68	stp x22,x21,[sp, #0x10]
00aedb6c	mov w22,w4
00aedb70	mov x4,x3
00aedb74	mov w3,w2
00aedb78	mov x23,x0
00aedb7c	mov w2,#0x2
00aedb80	mov x0,x1
00aedb84	mov w1,wzr
00aedb88	stp x20,x19,[sp, #0x20]
00aedb8c	stp x29,x30,[sp, #0x30]
00aedb90	add x29,sp,#0x30
00aedb94	mov x20,x6
00aedb98	mov w21,w5
00aedb9c	bl 0x00aef184
00aedba0	cbz x0,0x00aedbf4
00aedba4	ldr x8,[x23, #0x8]!
00aedba8	mov x19,x0
00aedbac	cbnz x8,0x00aedbbc
00aedbb0	bl 0x00c34780
00aedbb4	str x0,[x23]
00aedbb8	cbz x0,0x00aedbec
00aedbbc	stp w22,w21,[x19, #0x28]
00aedbc0	str x20,[x19, #0x30]
00aedbc4	ldr x0,[x23]
00aedbc8	mov x1,x19
00aedbcc	bl 0x00c347a0
00aedbd0	mov w20,w0
00aedbd4	cmp w0,#0x0
00aedbd8	b.gt 0x00aedbf8
00aedbdc	mov x0,x19
00aedbe0	sub w20,w20,#0x1
00aedbe4	bl 0x00aed930
00aedbe8	b 0x00aedbf8
00aedbec	mov x0,x19
00aedbf0	bl 0x00aed930
00aedbf4	mov w20,#0xffffffff
00aedbf8	mov w0,w20
00aedbfc	ldp x29,x30,[sp, #0x30]
00aedc00	ldp x20,x19,[sp, #0x20]
00aedc04	ldp x22,x21,[sp, #0x10]
00aedc08	ldr x23,[sp], #0x40
00aedc0c	ret
