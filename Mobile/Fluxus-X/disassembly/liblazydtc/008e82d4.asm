; cpr::Cookies::GetEncoded @ 008e82d4
008e82d4	stp x28,x27,[sp, #-0x60]!
008e82d8	stp x26,x25,[sp, #0x10]
008e82dc	stp x24,x23,[sp, #0x20]
008e82e0	stp x22,x21,[sp, #0x30]
008e82e4	stp x20,x19,[sp, #0x40]
008e82e8	stp x29,x30,[sp, #0x50]
008e82ec	add x29,sp,#0x50
008e82f0	sub sp,sp,#0x230
008e82f4	str x8,[sp, #0x20]
008e82f8	adrp x21,0xcb4000
008e82fc	adrp x8,0xcb4000
008e8300	str x1,[sp, #0x50]
008e8304	mrs x9,tpidr_el0
008e8308	ldr x21,[x21, #0xc90]
008e830c	ldr x8,[x8, #0xc88]
008e8310	str x9,[sp, #0x10]
008e8314	ldr x9,[x9, #0x28]
008e8318	add x19,sp,#0x100
008e831c	movi v0.2D,#0x0
008e8320	add x10,x8,#0x18
008e8324	mov x24,x0
008e8328	add x0,x19,#0x80
008e832c	add x20,x21,#0x40
008e8330	mov v0.D[0x0],x10
008e8334	add x1,x19,#0x18
008e8338	add x8,x8,#0x40
008e833c	str x9,[sp, #0x58]
008e8340	str x20,[sp, #0x110]
008e8344	str x8,[sp, #0x180]
008e8348	str q0,[sp, #0x100]
008e834c	str x0,[sp, #0x38]
008e8350	str x1,[sp, #0x18]
008e8354	bl 0x00c30100
008e8358	str xzr,[sp, #0x208]
008e835c	adrp x11,0xcb4000
008e8360	ldr x11,[x11, #0xa08]
008e8364	mov w8,#0xffffffff
008e8368	fmov d0,x20
008e836c	str w8,[sp, #0x210]
008e8370	add x8,x11,#0x10
008e8374	add x9,x21,#0x18
008e8378	add x10,x21,#0x68
008e837c	mov v0.D[0x1],x8
008e8380	add x0,x19,#0x20
008e8384	str x9,[sp, #0x100]
008e8388	str x10,[sp, #0x180]
008e838c	str q0,[sp, #0x110]
008e8390	str x0,[sp, #0x30]
008e8394	bl 0x00c30480
008e8398	movi v0.2D,#0x0
008e839c	stur q0,[x19, #0x48]
008e83a0	stur q0,[x19, #0x38]
008e83a4	stur q0,[x19, #0x28]
008e83a8	adrp x9,0xcb4000
008e83ac	ldr x9,[x9, #0xa00]
008e83b0	orr w8,wzr,#0x18
008e83b4	add x9,x9,#0x10
008e83b8	str x9,[sp, #0x118]
008e83bc	stur q0,[x19, #0x68]
008e83c0	stur q0,[x19, #0x58]
008e83c4	str w8,[sp, #0x178]
008e83c8	ldp x23,x19,[x24, #0x8]
008e83cc	cmp x23,x19
008e83d0	b.eq 0x008e8a2c
008e83d4	add x8,sp,#0x100
008e83d8	add x10,sp,#0xc0
008e83dc	add x11,sp,#0xa0
008e83e0	add x21,x8,#0x10
008e83e4	orr x8,x10,#0x1
008e83e8	add x12,sp,#0x80
008e83ec	str x8,[sp, #0x8]
008e83f0	orr x8,x11,#0x1
008e83f4	add x9,sp,#0xe0
008e83f8	add x13,sp,#0x60
008e83fc	stp x19,x8,[sp, #0x40]
008e8400	orr x8,x12,#0x1
008e8404	orr x25,x9,#0x1
008e8408	str x8,[sp, #0x28]
008e840c	orr x8,x13,#0x1
008e8410	str x8,[sp]
008e8414	ldrb w8,[x24]
008e8418	cbz w8,0x008e8440
008e841c	stp xzr,xzr,[sp, #0xc8]
008e8420	str xzr,[sp, #0xc0]
008e8424	ldrb w8,[x23]
008e8428	tbnz w8,#0x0,0x008e8468
008e842c	ldr x8,[x23, #0x10]
008e8430	str x8,[sp, #0xd0]
008e8434	ldr q0,[x23]
008e8438	str q0,[sp, #0xc0]
008e843c	b 0x008e84f4
008e8440	stp xzr,xzr,[sp, #0xe8]
008e8444	str xzr,[sp, #0xe0]
008e8448	ldrb w8,[x23]
008e844c	tbnz w8,#0x0,0x008e8494
008e8450	ldr x8,[x23, #0x10]
008e8454	mov w20,wzr
008e8458	str x8,[sp, #0xf0]
008e845c	ldr q0,[x23]
008e8460	str q0,[sp, #0xe0]
008e8464	b 0x008e8544
008e8468	ldr x28,[x23, #0x8]
008e846c	cmn x28,#0x10
008e8470	b.cs 0x008e8afc
008e8474	ldr x22,[x23, #0x10]
008e8478	cmp x28,#0x17
008e847c	b.cs 0x008e84c0
008e8480	ldr x27,[sp, #0x8]
008e8484	lsl w8,w28,#0x1
008e8488	strb w8,[sp, #0xc0]
008e848c	cbnz x28,0x008e84e0
008e8490	b 0x008e84f0
008e8494	ldr x28,[x23, #0x8]
008e8498	cmn x28,#0x10
008e849c	b.cs 0x008e8b04
008e84a0	ldr x22,[x23, #0x10]
008e84a4	cmp x28,#0x17
008e84a8	b.cs 0x008e850c
008e84ac	lsl w8,w28,#0x1
008e84b0	mov x27,x25
008e84b4	strb w8,[sp, #0xe0]
008e84b8	cbnz x28,0x008e852c
008e84bc	b 0x008e853c
008e84c0	add x8,x28,#0x10
008e84c4	and x26,x8,#-0x10
008e84c8	mov x0,x26
008e84cc	bl 0x00c2fed0
008e84d0	orr x8,x26,#0x1
008e84d4	mov x27,x0
008e84d8	stp x28,x0,[sp, #0xc8]
008e84dc	str x8,[sp, #0xc0]
008e84e0	mov x0,x27
008e84e4	mov x1,x22
008e84e8	mov x2,x28
008e84ec	bl 0x00c2ffd0
008e84f0	strb wzr,[x27, x28]
008e84f4	ldr x0,[sp, #0x50]
008e84f8	add x8,sp,#0xe0
008e84fc	add x1,sp,#0xc0
008e8500	bl 0x00c30e30
008e8504	mov w20,#0x1
008e8508	b 0x008e8544
008e850c	add x8,x28,#0x10
008e8510	and x26,x8,#-0x10
008e8514	mov x0,x26
008e8518	bl 0x00c2fed0
008e851c	orr x8,x26,#0x1
008e8520	mov x27,x0
008e8524	stp x28,x0,[sp, #0xe8]
008e8528	str x8,[sp, #0xe0]
008e852c	mov x0,x27
008e8530	mov x1,x22
008e8534	mov x2,x28
008e8538	bl 0x00c2ffd0
008e853c	mov w20,wzr
008e8540	strb wzr,[x27, x28]
008e8544	ldrb w8,[sp, #0xe0]
008e8548	ldp x10,x9,[sp, #0xe8]
008e854c	tst w8,#0x1
008e8550	lsr w11,w8,#0x1
008e8554	csel x1,x25,x9,eq
008e8558	csel x2,x11,x10,eq
008e855c	mov x0,x21
008e8560	bl 0x00c30e90
008e8564	adrp x1,0x2c4000
008e8568	mov w2,#0x1
008e856c	add x1,x1,#0xdac
008e8570	bl 0x00c30e90
008e8574	ldrb w8,[sp, #0xe0]
008e8578	tbz w8,#0x0,0x008e8584
008e857c	ldr x0,[sp, #0xf0]
008e8580	bl 0x00c301d0
008e8584	cbz w20,0x008e8598
008e8588	ldrb w8,[sp, #0xc0]
008e858c	tbz w8,#0x0,0x008e8598
008e8590	ldr x0,[sp, #0xd0]
008e8594	bl 0x00c301d0
008e8598	stp xzr,xzr,[sp, #0xe8]
008e859c	str xzr,[sp, #0xe0]
008e85a0	mov x20,x23
008e85a4	ldrb w8,[x20, #0x18]!
008e85a8	tbnz w8,#0x0,0x008e85c0
008e85ac	ldr x8,[x20, #0x10]
008e85b0	str x8,[sp, #0xf0]
008e85b4	ldr q0,[x20]
008e85b8	str q0,[sp, #0xe0]
008e85bc	b 0x008e8620
008e85c0	ldr x28,[x23, #0x20]
008e85c4	cmn x28,#0x10
008e85c8	b.cs 0x008e8acc
008e85cc	ldr x22,[x23, #0x28]
008e85d0	cmp x28,#0x17
008e85d4	b.cs 0x008e85ec
008e85d8	lsl w8,w28,#0x1
008e85dc	mov x27,x25
008e85e0	strb w8,[sp, #0xe0]
008e85e4	cbnz x28,0x008e860c
008e85e8	b 0x008e861c
008e85ec	add x8,x28,#0x10
008e85f0	and x26,x8,#-0x10
008e85f4	mov x0,x26
008e85f8	bl 0x00c2fed0
008e85fc	orr x8,x26,#0x1
008e8600	mov x27,x0
008e8604	stp x28,x0,[sp, #0xe8]
008e8608	str x8,[sp, #0xe0]
008e860c	mov x0,x27
008e8610	mov x1,x22
008e8614	mov x2,x28
008e8618	bl 0x00c2ffd0
008e861c	strb wzr,[x27, x28]
008e8620	ldrb w8,[sp, #0xe0]
008e8624	ldr x9,[sp, #0xe8]
008e8628	lsr w10,w8,#0x1
008e862c	tst w8,#0x1
008e8630	csel x9,x10,x9,eq
008e8634	cbz x9,0x008e865c
008e8638	stp xzr,xzr,[sp, #0xa8]
008e863c	str xzr,[sp, #0xa0]
008e8640	ldrb w8,[x20]
008e8644	tbnz w8,#0x0,0x008e866c
008e8648	ldr x8,[x20, #0x10]
008e864c	str x8,[sp, #0xb0]
008e8650	ldr q0,[x20]
008e8654	str q0,[sp, #0xa0]
008e8658	b 0x008e86cc
008e865c	mov w22,wzr
008e8660	and w8,w8,#0x1
008e8664	cbnz w8,0x008e8734
008e8668	b 0x008e873c
008e866c	ldr x28,[x23, #0x20]
008e8670	cmn x28,#0x10
008e8674	b.cs 0x008e8ad4
008e8678	ldr x22,[x23, #0x28]
008e867c	cmp x28,#0x17
008e8680	b.cs 0x008e8698
008e8684	ldr x27,[sp, #0x48]
008e8688	lsl w8,w28,#0x1
008e868c	strb w8,[sp, #0xa0]
008e8690	cbnz x28,0x008e86b8
008e8694	b 0x008e86c8
008e8698	add x8,x28,#0x10
008e869c	and x26,x8,#-0x10
008e86a0	mov x0,x26
008e86a4	bl 0x00c2fed0
008e86a8	orr x8,x26,#0x1
008e86ac	mov x27,x0
008e86b0	stp x28,x0,[sp, #0xa8]
008e86b4	str x8,[sp, #0xa0]
008e86b8	mov x0,x27
008e86bc	mov x1,x22
008e86c0	mov x2,x28
008e86c4	bl 0x00c2ffd0
008e86c8	strb wzr,[x27, x28]
008e86cc	ldrb w8,[sp, #0xa0]
008e86d0	ldr x9,[sp, #0xb0]
008e86d4	ldr x10,[sp, #0x48]
008e86d8	tst w8,#0x1
008e86dc	and w19,w8,#0x1
008e86e0	csel x9,x10,x9,eq
008e86e4	ldrb w9,[x9]
008e86e8	cmp w9,#0x22
008e86ec	b.ne 0x008e8714
008e86f0	stp xzr,xzr,[sp, #0x88]
008e86f4	str xzr,[sp, #0x80]
008e86f8	ldrb w8,[x20]
008e86fc	tbnz w8,#0x0,0x008e8810
008e8700	ldr x8,[x20, #0x10]
008e8704	str x8,[sp, #0x90]
008e8708	ldr q0,[x20]
008e870c	str q0,[sp, #0x80]
008e8710	b 0x008e894c
008e8714	mov w22,wzr
008e8718	cbz w19,0x008e8724
008e871c	ldr x0,[sp, #0xb0]
008e8720	bl 0x00c301d0
008e8724	ldrb w8,[sp, #0xe0]
008e8728	ldr x19,[sp, #0x40]
008e872c	and w8,w8,#0x1
008e8730	cbz w8,0x008e873c
008e8734	ldr x0,[sp, #0xf0]
008e8738	bl 0x00c301d0
008e873c	cbz w22,0x008e8764
008e8740	stp xzr,xzr,[sp, #0xe8]
008e8744	str xzr,[sp, #0xe0]
008e8748	ldrb w8,[x20]
008e874c	tbnz w8,#0x0,0x008e8790
008e8750	ldr x8,[x20, #0x10]
008e8754	str x8,[sp, #0xf0]
008e8758	ldr q0,[x20]
008e875c	str q0,[sp, #0xe0]
008e8760	b 0x008e8870
008e8764	ldrb w8,[x24]
008e8768	cbz w8,0x008e87bc
008e876c	stp xzr,xzr,[sp, #0x68]
008e8770	str xzr,[sp, #0x60]
008e8774	ldrb w8,[x20]
008e8778	tbnz w8,#0x0,0x008e87e4
008e877c	ldr x8,[x20, #0x10]
008e8780	str x8,[sp, #0x70]
008e8784	ldr q0,[x20]
008e8788	str q0,[sp, #0x60]
008e878c	b 0x008e8900
008e8790	ldr x28,[x23, #0x20]
008e8794	cmn x28,#0x10
008e8798	b.cs 0x008e8aec
008e879c	ldr x22,[x23, #0x28]
008e87a0	cmp x28,#0x17
008e87a4	b.cs 0x008e883c
008e87a8	lsl w8,w28,#0x1
008e87ac	mov x27,x25
008e87b0	strb w8,[sp, #0xe0]
008e87b4	cbnz x28,0x008e885c
008e87b8	b 0x008e886c
008e87bc	stp xzr,xzr,[sp, #0xe8]
008e87c0	str xzr,[sp, #0xe0]
008e87c4	ldrb w8,[x20]
008e87c8	tbnz w8,#0x0,0x008e88a0
008e87cc	ldr x8,[x20, #0x10]
008e87d0	mov w26,wzr
008e87d4	str x8,[sp, #0xf0]
008e87d8	ldr q0,[x20]
008e87dc	str q0,[sp, #0xe0]
008e87e0	b 0x008e89c8
008e87e4	ldr x28,[x23, #0x20]
008e87e8	cmn x28,#0x10
008e87ec	b.cs 0x008e8ae4
008e87f0	ldr x22,[x23, #0x28]
008e87f4	cmp x28,#0x17
008e87f8	b.cs 0x008e88cc
008e87fc	ldr x27,[sp]
008e8800	lsl w8,w28,#0x1
008e8804	strb w8,[sp, #0x60]
008e8808	cbnz x28,0x008e88ec
008e880c	b 0x008e88fc
008e8810	ldr x28,[x23, #0x20]
008e8814	cmn x28,#0x10
008e8818	b.cs 0x008e8adc
008e881c	ldr x22,[x23, #0x28]
008e8820	cmp x28,#0x17
008e8824	b.cs 0x008e8918
008e8828	ldr x27,[sp, #0x28]
008e882c	lsl w8,w28,#0x1
008e8830	strb w8,[sp, #0x80]
008e8834	cbnz x28,0x008e8938
008e8838	b 0x008e8948
008e883c	add x8,x28,#0x10
008e8840	and x26,x8,#-0x10
008e8844	mov x0,x26
008e8848	bl 0x00c2fed0
008e884c	orr x8,x26,#0x1
008e8850	mov x27,x0
008e8854	stp x28,x0,[sp, #0xe8]
008e8858	str x8,[sp, #0xe0]
008e885c	mov x0,x27
008e8860	mov x1,x22
008e8864	mov x2,x28
008e8868	bl 0x00c2ffd0
008e886c	strb wzr,[x27, x28]
008e8870	ldrb w8,[sp, #0xe0]
008e8874	ldp x10,x9,[sp, #0xe8]
008e8878	tst w8,#0x1
008e887c	lsr w11,w8,#0x1
008e8880	csel x1,x25,x9,eq
008e8884	csel x2,x11,x10,eq
008e8888	mov x0,x21
008e888c	bl 0x00c30e90
008e8890	ldrb w8,[sp, #0xe0]
008e8894	tbz w8,#0x0,0x008e8a0c
008e8898	ldr x0,[sp, #0xf0]
008e889c	b 0x008e8a08
008e88a0	ldr x28,[x23, #0x20]
008e88a4	cmn x28,#0x10
008e88a8	b.cs 0x008e8af4
008e88ac	ldr x22,[x23, #0x28]
008e88b0	cmp x28,#0x17
008e88b4	b.cs 0x008e8990
008e88b8	lsl w8,w28,#0x1
008e88bc	mov x27,x25
008e88c0	strb w8,[sp, #0xe0]
008e88c4	cbnz x28,0x008e89b0
008e88c8	b 0x008e89c0
008e88cc	add x8,x28,#0x10
008e88d0	and x26,x8,#-0x10
008e88d4	mov x0,x26
008e88d8	bl 0x00c2fed0
008e88dc	orr x8,x26,#0x1
008e88e0	mov x27,x0
008e88e4	stp x28,x0,[sp, #0x68]
008e88e8	str x8,[sp, #0x60]
008e88ec	mov x0,x27
008e88f0	mov x1,x22
008e88f4	mov x2,x28
008e88f8	bl 0x00c2ffd0
008e88fc	strb wzr,[x27, x28]
008e8900	ldr x0,[sp, #0x50]
008e8904	add x8,sp,#0xe0
008e8908	add x1,sp,#0x60
008e890c	bl 0x00c30e30
008e8910	mov w26,#0x1
008e8914	b 0x008e89c8
008e8918	add x8,x28,#0x10
008e891c	and x26,x8,#-0x10
008e8920	mov x0,x26
008e8924	bl 0x00c2fed0
008e8928	orr x8,x26,#0x1
008e892c	mov x27,x0
008e8930	stp x28,x0,[sp, #0x88]
008e8934	str x8,[sp, #0x80]
008e8938	mov x0,x27
008e893c	mov x1,x22
008e8940	mov x2,x28
008e8944	bl 0x00c2ffd0
008e8948	strb wzr,[x27, x28]
008e894c	ldrb w8,[sp, #0x80]
008e8950	ldp x9,x0,[sp, #0x88]
008e8954	ldr x11,[sp, #0x28]
008e8958	lsr w10,w8,#0x1
008e895c	tst w8,#0x1
008e8960	csel x11,x11,x0,eq
008e8964	csel x9,x10,x9,eq
008e8968	add x9,x11,x9
008e896c	ldurb w9,[x9, #-0x1]
008e8970	cmp w9,#0x22
008e8974	cset w22,eq
008e8978	tbz w8,#0x0,0x008e8980
008e897c	bl 0x00c301d0
008e8980	ldrb w8,[sp, #0xa0]
008e8984	and w19,w8,#0x1
008e8988	cbnz w19,0x008e871c
008e898c	b 0x008e8724
008e8990	add x8,x28,#0x10
008e8994	and x26,x8,#-0x10
008e8998	mov x0,x26
008e899c	bl 0x00c2fed0
008e89a0	orr x8,x26,#0x1
008e89a4	mov x27,x0
008e89a8	stp x28,x0,[sp, #0xe8]
008e89ac	str x8,[sp, #0xe0]
008e89b0	mov x0,x27
008e89b4	mov x1,x22
008e89b8	mov x2,x28
008e89bc	bl 0x00c2ffd0
008e89c0	mov w26,wzr
008e89c4	strb wzr,[x27, x28]
008e89c8	ldrb w8,[sp, #0xe0]
008e89cc	ldp x10,x9,[sp, #0xe8]
008e89d0	tst w8,#0x1
008e89d4	lsr w11,w8,#0x1
008e89d8	csel x1,x25,x9,eq
008e89dc	csel x2,x11,x10,eq
008e89e0	mov x0,x21
008e89e4	bl 0x00c30e90
008e89e8	ldrb w8,[sp, #0xe0]
008e89ec	tbz w8,#0x0,0x008e89f8
008e89f0	ldr x0,[sp, #0xf0]
008e89f4	bl 0x00c301d0
008e89f8	cbz w26,0x008e8a0c
008e89fc	ldrb w8,[sp, #0x60]
008e8a00	tbz w8,#0x0,0x008e8a0c
008e8a04	ldr x0,[sp, #0x70]
008e8a08	bl 0x00c301d0
008e8a0c	adrp x1,0x2ba000
008e8a10	mov w2,#0x2
008e8a14	mov x0,x21
008e8a18	add x1,x1,#0xf99
008e8a1c	bl 0x00c30e90
008e8a20	add x23,x23,#0x78
008e8a24	cmp x19,x23
008e8a28	b.ne 0x008e8414
008e8a2c	ldp x0,x8,[sp, #0x18]
008e8a30	bl 0x00c30e20
008e8a34	adrp x8,0xcb4000
008e8a38	ldr x8,[x8, #0xc90]
008e8a3c	adrp x11,0xcb4000
008e8a40	ldr x11,[x11, #0xa00]
008e8a44	ldp x20,x19,[sp, #0x30]
008e8a48	mov x10,x8
008e8a4c	add x8,x8,#0x18
008e8a50	str x8,[sp, #0x100]
008e8a54	ldrb w8,[sp, #0x158]
008e8a58	add x9,x10,#0x68
008e8a5c	add x10,x10,#0x40
008e8a60	add x11,x11,#0x10
008e8a64	str x9,[sp, #0x180]
008e8a68	stp x10,x11,[sp, #0x110]
008e8a6c	tbz w8,#0x0,0x008e8a78
008e8a70	ldr x0,[sp, #0x168]
008e8a74	bl 0x00c301d0
008e8a78	adrp x8,0xcb4000
008e8a7c	ldr x8,[x8, #0xa08]
008e8a80	mov x0,x20
008e8a84	add x8,x8,#0x10
008e8a88	str x8,[sp, #0x118]
008e8a8c	bl 0x00c30090
008e8a90	mov x0,x19
008e8a94	bl 0x00c30ee0
008e8a98	ldr x8,[sp, #0x10]
008e8a9c	ldr x8,[x8, #0x28]
008e8aa0	ldr x9,[sp, #0x58]
008e8aa4	cmp x8,x9
008e8aa8	b.ne 0x008e8b0c
008e8aac	add sp,sp,#0x230
008e8ab0	ldp x29,x30,[sp, #0x50]
008e8ab4	ldp x20,x19,[sp, #0x40]
008e8ab8	ldp x22,x21,[sp, #0x30]
008e8abc	ldp x24,x23,[sp, #0x20]
008e8ac0	ldp x26,x25,[sp, #0x10]
008e8ac4	ldp x28,x27,[sp], #0x60
008e8ac8	ret
008e8acc	add x0,sp,#0xe0
008e8ad0	bl 0x00c30ce0
008e8ad4	add x0,sp,#0xa0
008e8ad8	bl 0x00c30ce0
008e8adc	add x0,sp,#0x80
008e8ae0	bl 0x00c30ce0
008e8ae4	add x0,sp,#0x60
008e8ae8	bl 0x00c30ce0
008e8aec	add x0,sp,#0xe0
008e8af0	bl 0x00c30ce0
008e8af4	add x0,sp,#0xe0
008e8af8	bl 0x00c30ce0
008e8afc	add x0,sp,#0xc0
008e8b00	bl 0x00c30ce0
008e8b04	add x0,sp,#0xe0
008e8b08	bl 0x00c30ce0
008e8b0c	bl 0x00c2fec0
