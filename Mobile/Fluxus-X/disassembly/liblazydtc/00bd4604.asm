; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get @ 00bd4604
00bd4604	paciasp
00bd4608	stp x29,x30,[sp, #-0x50]!
00bd460c	str x25,[sp, #0x10]
00bd4610	stp x24,x23,[sp, #0x20]
00bd4614	stp x22,x21,[sp, #0x30]
00bd4618	stp x20,x19,[sp, #0x40]
00bd461c	mov x29,sp
00bd4620	mov x19,x0
00bd4624	mov x20,x2
00bd4628	mov x21,x1
00bd462c	str xzr,[x0, #0x8]
00bd4630	add x0,x29,#0x1c
00bd4634	mov x1,x19
00bd4638	mov w2,#0x1
00bd463c	mov w22,w3
00bd4640	bl 0x00c44060
00bd4644	ldrb w8,[x29, #0x1c]
00bd4648	cmp w8,#0x1
00bd464c	b.ne 0x00bd4764
00bd4650	subs x23,x20,#0x1
00bd4654	b.lt 0x00bd470c
00bd4658	ldr x8,[x19, #0x8]
00bd465c	cmp x8,x23
00bd4660	b.ge 0x00bd4714
00bd4664	add x24,x19,#0x28
00bd4668	b 0x00bd4698
00bd466c	ldr x9,[x19]
00bd4670	ldur x9,[x9, #-0x18]
00bd4674	ldr x0,[x24, x9#0x0]
00bd4678	ldp x9,x10,[x0, #0x18]
00bd467c	cmp x9,x10
00bd4680	b.eq 0x00bd46f8
00bd4684	add x9,x9,#0x4
00bd4688	str x9,[x0, #0x18]
00bd468c	cmp x8,x23
00bd4690	mov x21,x25
00bd4694	b.ge 0x00bd4734
00bd4698	ldr x8,[x19]
00bd469c	ldur x8,[x8, #-0x18]
00bd46a0	ldr x0,[x24, x8#0x0]
00bd46a4	ldp x8,x9,[x0, #0x18]
00bd46a8	cmp x8,x9
00bd46ac	b.eq 0x00bd46b8
00bd46b0	ldr w0,[x8]
00bd46b4	b 0x00bd46c4
00bd46b8	ldr x8,[x0]
00bd46bc	ldr x8,[x8, #0x48]
00bd46c0	blr x8
00bd46c4	cmn w0,#0x1
00bd46c8	b.eq 0x00bd471c
00bd46cc	ldr x10,[x19, #0x8]
00bd46d0	cmp w0,w22
00bd46d4	b.eq 0x00bd4728
00bd46d8	mov x8,#0x7fffffffffffffff
00bd46dc	mov x25,x21
00bd46e0	cmp x10,x8
00bd46e4	str w0,[x25], #0x4
00bd46e8	b.eq 0x00bd466c
00bd46ec	add x8,x10,#0x1
00bd46f0	str x8,[x19, #0x8]
00bd46f4	b 0x00bd466c
00bd46f8	ldr x8,[x0]
00bd46fc	ldr x8,[x8, #0x50]
00bd4700	blr x8
00bd4704	ldr x8,[x19, #0x8]
00bd4708	b 0x00bd468c
00bd470c	mov w8,#0x4
00bd4710	b 0x00bd474c
00bd4714	mov w9,wzr
00bd4718	b 0x00bd473c
00bd471c	ldr x8,[x19, #0x8]
00bd4720	mov w9,#0x2
00bd4724	b 0x00bd473c
00bd4728	mov w9,wzr
00bd472c	mov x8,x10
00bd4730	b 0x00bd473c
00bd4734	mov w9,wzr
00bd4738	mov x21,x25
00bd473c	orr w10,w9,#0x4
00bd4740	cmp x8,#0x0
00bd4744	csel w8,w10,w9,eq
00bd4748	str wzr,[x21]
00bd474c	ldr x9,[x19]
00bd4750	ldur x9,[x9, #-0x18]
00bd4754	add x0,x19,x9
00bd4758	ldr w9,[x0, #0x20]
00bd475c	orr w1,w9,w8
00bd4760	bl 0x00c30130
00bd4764	cmp x20,#0x1
00bd4768	b.lt 0x00bd4770
00bd476c	str wzr,[x21]
00bd4770	mov x0,x19
00bd4774	ldp x20,x19,[sp, #0x40]
00bd4778	ldr x25,[sp, #0x10]
00bd477c	ldp x22,x21,[sp, #0x30]
00bd4780	ldp x24,x23,[sp, #0x20]
00bd4784	ldp x29,x30,[sp], #0x50
00bd4788	autiasp
00bd478c	ret
