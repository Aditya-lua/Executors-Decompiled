; BIO_socket_wait @ 009ff860
009ff860	sub sp,sp,#0xd0
009ff864	cmp w0,#0x3ff
009ff868	str x23,[sp, #0x90]
009ff86c	stp x22,x21,[sp, #0xa0]
009ff870	stp x20,x19,[sp, #0xb0]
009ff874	stp x29,x30,[sp, #0xc0]
009ff878	add x29,sp,#0xc0
009ff87c	b.ls 0x009ff888
009ff880	mov w0,#0xffffffff
009ff884	b 0x009ff900
009ff888	mov x20,x2
009ff88c	cbz x2,0x009ff8fc
009ff890	mov w19,w0
009ff894	mov x0,xzr
009ff898	mov w21,w1
009ff89c	bl 0x00c30970
009ff8a0	mov x22,x0
009ff8a4	cmp x0,x20
009ff8a8	mov w0,wzr
009ff8ac	b.gt 0x009ff900
009ff8b0	add x0,sp,#0x10
009ff8b4	mov w2,#0x80
009ff8b8	mov w1,wzr
009ff8bc	add x23,sp,#0x10
009ff8c0	bl 0x00c301c0
009ff8c4	add x1,sp,#0x10
009ff8c8	mov w2,#0x80
009ff8cc	mov w0,w19
009ff8d0	bl 0x00c31ee0
009ff8d4	cmp w21,#0x0
009ff8d8	sub x8,x20,x22
009ff8dc	add w0,w19,#0x1
009ff8e0	csel x1,x23,xzr,ne
009ff8e4	csel x2,xzr,x23,ne
009ff8e8	mov x4,sp
009ff8ec	mov x3,xzr
009ff8f0	stp x8,xzr,[sp]
009ff8f4	bl 0x00c31f50
009ff8f8	b 0x009ff900
009ff8fc	mov w0,#0x1
009ff900	ldp x29,x30,[sp, #0xc0]
009ff904	ldp x20,x19,[sp, #0xb0]
009ff908	ldp x22,x21,[sp, #0xa0]
009ff90c	ldr x23,[sp, #0x90]
009ff910	add sp,sp,#0xd0
009ff914	ret
