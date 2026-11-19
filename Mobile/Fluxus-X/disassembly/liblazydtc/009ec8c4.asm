; d2i_ASN1_OBJECT @ 009ec8c4
009ec8c4	sub sp,sp,#0x40
009ec8c8	stp x20,x19,[sp, #0x20]
009ec8cc	stp x29,x30,[sp, #0x30]
009ec8d0	ldr x8,[x1]
009ec8d4	mov x4,x2
009ec8d8	mov x19,x1
009ec8dc	mov x20,x0
009ec8e0	add x0,sp,#0x18
009ec8e4	add x1,sp,#0x10
009ec8e8	add x2,sp,#0xc
009ec8ec	add x3,sp,#0x8
009ec8f0	add x29,sp,#0x30
009ec8f4	str x8,[sp, #0x18]
009ec8f8	bl 0x00c376a0
009ec8fc	tbnz w0,#0x7,0x009ec92c
009ec900	ldr w8,[sp, #0xc]
009ec904	cmp w8,#0x6
009ec908	b.ne 0x009ec934
009ec90c	ldr x2,[sp, #0x10]
009ec910	add x1,sp,#0x18
009ec914	mov x0,x20
009ec918	bl 0x009ec978
009ec91c	cbz x0,0x009ec968
009ec920	ldr x8,[sp, #0x18]
009ec924	str x8,[x19]
009ec928	b 0x009ec968
009ec92c	mov w19,#0x66
009ec930	b 0x009ec938
009ec934	mov w19,#0x74
009ec938	bl 0x00c342a0
009ec93c	adrp x0,0x2b7000
009ec940	adrp x2,0x2cd000
009ec944	add x0,x0,#0x892
009ec948	add x2,x2,#0x7fd
009ec94c	orr w1,wzr,#0xf0
009ec950	bl 0x00c342b0
009ec954	mov w0,#0xd
009ec958	mov w1,w19
009ec95c	mov x2,xzr
009ec960	bl 0x00c342c0
009ec964	mov x0,xzr
009ec968	ldp x29,x30,[sp, #0x30]
009ec96c	ldp x20,x19,[sp, #0x20]
009ec970	add sp,sp,#0x40
009ec974	ret
