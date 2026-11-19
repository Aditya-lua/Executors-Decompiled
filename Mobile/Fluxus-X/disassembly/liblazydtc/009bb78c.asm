; SSL_use_certificate_ASN1 @ 009bb78c
009bb78c	sub sp,sp,#0x30
009bb790	stp x20,x19,[sp, #0x10]
009bb794	stp x29,x30,[sp, #0x20]
009bb798	str x1,[sp, #0x8]
009bb79c	ldr x8,[x0, #0x9a8]
009bb7a0	mov x19,x0
009bb7a4	add x29,sp,#0x20
009bb7a8	mov w20,w2
009bb7ac	ldr x0,[x8]
009bb7b0	ldr x1,[x8, #0x440]
009bb7b4	bl 0x00c350a0
009bb7b8	str x0,[sp]
009bb7bc	cbz x0,0x009bb7f4
009bb7c0	sxtw x2,w20
009bb7c4	mov x0,sp
009bb7c8	add x1,sp,#0x8
009bb7cc	bl 0x00c35ca0
009bb7d0	ldr x1,[sp]
009bb7d4	cbz x0,0x009bb820
009bb7d8	mov x0,x19
009bb7dc	bl 0x009bb34c
009bb7e0	ldr x8,[sp]
009bb7e4	mov w19,w0
009bb7e8	mov x0,x8
009bb7ec	bl 0x00c31a90
009bb7f0	b 0x009bb85c
009bb7f4	bl 0x00c342a0
009bb7f8	adrp x0,0x2db000
009bb7fc	adrp x2,0x2a3000
009bb800	add x0,x0,#0xaec
009bb804	add x2,x2,#0xc43
009bb808	mov w1,#0x67
009bb80c	bl 0x00c342b0
009bb810	mov w1,#0x100
009bb814	mov w0,#0x14
009bb818	movk w1,#0xc, LSL #16
009bb81c	b 0x009bb850
009bb820	mov x0,x1
009bb824	bl 0x00c31a90
009bb828	bl 0x00c342a0
009bb82c	adrp x0,0x2db000
009bb830	adrp x2,0x2a3000
009bb834	add x0,x0,#0xaec
009bb838	add x2,x2,#0xc43
009bb83c	mov w1,#0x6d
009bb840	bl 0x00c342b0
009bb844	mov w1,#0xd
009bb848	mov w0,#0x14
009bb84c	movk w1,#0x8, LSL #16
009bb850	mov x2,xzr
009bb854	bl 0x00c342c0
009bb858	mov w19,wzr
009bb85c	mov w0,w19
009bb860	ldp x29,x30,[sp, #0x20]
009bb864	ldp x20,x19,[sp, #0x10]
009bb868	add sp,sp,#0x30
009bb86c	ret
