; OCSP_REQUEST_print @ 00ab1880
00ab1880	str x25,[sp, #-0x50]!
00ab1884	stp x24,x23,[sp, #0x10]
00ab1888	stp x22,x21,[sp, #0x20]
00ab188c	stp x20,x19,[sp, #0x30]
00ab1890	stp x29,x30,[sp, #0x40]
00ab1894	ldr x19,[x1, #0x20]
00ab1898	mov x22,x1
00ab189c	adrp x1,0x29e000
00ab18a0	mov x21,x2
00ab18a4	add x1,x1,#0x84d
00ab18a8	mov w2,#0x13
00ab18ac	add x29,sp,#0x40
00ab18b0	mov x20,x0
00ab18b4	bl 0x00c34240
00ab18b8	cmp w0,#0x1
00ab18bc	b.lt 0x00ab1a34
00ab18c0	ldr x0,[x22]
00ab18c4	bl 0x00c37580
00ab18c8	adrp x1,0x2c2000
00ab18cc	mov x3,x0
00ab18d0	add x2,x0,#0x1
00ab18d4	add x1,x1,#0x25d
00ab18d8	mov x0,x20
00ab18dc	bl 0x00c32250
00ab18e0	cmp w0,#0x1
00ab18e4	b.lt 0x00ab1a34
00ab18e8	ldr x8,[x22, #0x8]
00ab18ec	cbz x8,0x00ab1918
00ab18f0	adrp x1,0x2a8000
00ab18f4	add x1,x1,#0x6a1
00ab18f8	mov w2,#0x15
00ab18fc	mov x0,x20
00ab1900	bl 0x00c34240
00ab1904	cmp w0,#0x1
00ab1908	b.lt 0x00ab1a34
00ab190c	ldr x1,[x22, #0x8]
00ab1910	mov x0,x20
00ab1914	bl 0x00c3f070
00ab1918	adrp x1,0x2dc000
00ab191c	add x1,x1,#0x7ca
00ab1920	mov w2,#0x15
00ab1924	mov x0,x20
00ab1928	bl 0x00c34240
00ab192c	cmp w0,#0x1
00ab1930	b.lt 0x00ab1a34
00ab1934	ldr x0,[x22, #0x10]
00ab1938	bl 0x00c325e0
00ab193c	cmp w0,#0x1
00ab1940	b.lt 0x00ab19a0
00ab1944	adrp x24,0x2a2000
00ab1948	mov w23,wzr
00ab194c	add x24,x24,#0xb19
00ab1950	ldr x0,[x22, #0x10]
00ab1954	mov w1,w23
00ab1958	bl 0x00c32610
00ab195c	ldr x1,[x0]
00ab1960	mov x25,x0
00ab1964	mov w2,#0x8
00ab1968	mov x0,x20
00ab196c	bl 0x00ab1a58
00ab1970	ldr x2,[x25, #0x8]
00ab1974	mov w4,#0x8
00ab1978	mov x0,x20
00ab197c	mov x1,x24
00ab1980	mov x3,x21
00ab1984	bl 0x00c3f080
00ab1988	cbz w0,0x00ab1a38
00ab198c	ldr x0,[x22, #0x10]
00ab1990	add w23,w23,#0x1
00ab1994	bl 0x00c325e0
00ab1998	cmp w23,w0
00ab199c	b.lt 0x00ab1950
00ab19a0	ldr x2,[x22, #0x18]
00ab19a4	adrp x1,0x29e000
00ab19a8	add x1,x1,#0x861
00ab19ac	mov w4,#0x4
00ab19b0	mov x0,x20
00ab19b4	mov x3,x21
00ab19b8	bl 0x00c3f080
00ab19bc	cbz w0,0x00ab1a38
00ab19c0	cbz x19,0x00ab1a50
00ab19c4	ldr x2,[x19, #0x10]
00ab19c8	mov x0,x20
00ab19cc	mov x1,x19
00ab19d0	bl 0x00c3f0a0
00ab19d4	ldr x0,[x19, #0x18]
00ab19d8	bl 0x00c325e0
00ab19dc	cmp w0,#0x1
00ab19e0	b.lt 0x00ab1a50
00ab19e4	mov w21,wzr
00ab19e8	ldr x0,[x19, #0x18]
00ab19ec	mov w1,w21
00ab19f0	bl 0x00c32610
00ab19f4	mov x1,x0
00ab19f8	mov x0,x20
00ab19fc	bl 0x00c3f090
00ab1a00	ldr x0,[x19, #0x18]
00ab1a04	mov w1,w21
00ab1a08	bl 0x00c32610
00ab1a0c	mov x1,x0
00ab1a10	mov x0,x20
00ab1a14	bl 0x00c32660
00ab1a18	ldr x0,[x19, #0x18]
00ab1a1c	add w21,w21,#0x1
00ab1a20	bl 0x00c325e0
00ab1a24	cmp w21,w0
00ab1a28	mov w0,#0x1
00ab1a2c	b.lt 0x00ab19e8
00ab1a30	b 0x00ab1a38
00ab1a34	mov w0,wzr
00ab1a38	ldp x29,x30,[sp, #0x40]
00ab1a3c	ldp x20,x19,[sp, #0x30]
00ab1a40	ldp x22,x21,[sp, #0x20]
00ab1a44	ldp x24,x23,[sp, #0x10]
00ab1a48	ldr x25,[sp], #0x50
00ab1a4c	ret
00ab1a50	mov w0,#0x1
00ab1a54	b 0x00ab1a38
