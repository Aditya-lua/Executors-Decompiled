; FUN_00c19724 @ 00c19724
00c19724	paciasp
00c19728	stp x29,x30,[sp, #-0x30]!
00c1972c	str x21,[sp, #0x10]
00c19730	stp x20,x19,[sp, #0x20]
00c19734	mov x29,sp
00c19738	ldr x21,[x0, #0x1330]
00c1973c	mov x19,x1
00c19740	ldr x8,[x21, #0x8]
00c19744	sub x9,x8,#0xfd0
00c19748	cmn x9,#0xff1
00c1974c	b.hi 0x00c19770
00c19750	mov x20,x0
00c19754	mov w0,#0x1000
00c19758	bl 0x00c308d0
00c1975c	cbz x0,0x00c197bc
00c19760	mov x8,xzr
00c19764	stp x21,xzr,[x0]
00c19768	mov x21,x0
00c1976c	str x0,[x20, #0x1330]
00c19770	add x9,x8,#0x20
00c19774	add x0,x21,x8
00c19778	adrp x8,0xcb2000
00c1977c	add x8,x8,#0xd50
00c19780	str x9,[x21, #0x8]
00c19784	mov w9,#0x540
00c19788	str x8,[x0, #0x10]!
00c1978c	ldurh w8,[x0, #0x9]
00c19790	strb wzr,[x0, #0x8]
00c19794	and w8,w8,#0xf000
00c19798	ldr q0,[x19]
00c1979c	orr w8,w8,w9
00c197a0	sturh w8,[x0, #0x9]
00c197a4	str q0,[x0, #0x10]
00c197a8	ldp x20,x19,[sp, #0x20]
00c197ac	ldr x21,[sp, #0x10]
00c197b0	ldp x29,x30,[sp], #0x30
00c197b4	autiasp
00c197b8	ret
00c197bc	bl 0x00c2fff0
