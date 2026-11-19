; FUN_00bd1850 @ 00bd1850
00bd1850	paciasp
00bd1854	sub sp,sp,#0x60
00bd1858	stp x29,x30,[sp, #0x20]
00bd185c	stp x24,x23,[sp, #0x30]
00bd1860	stp x22,x21,[sp, #0x40]
00bd1864	stp x20,x19,[sp, #0x50]
00bd1868	add x29,sp,#0x20
00bd186c	mov x20,x1
00bd1870	mov x19,x0
00bd1874	add x0,sp,#0x8
00bd1878	mov x1,x19
00bd187c	bl 0x00c43fa0
00bd1880	ldrb w8,[sp, #0x8]
00bd1884	cmp w8,#0x1
00bd1888	b.ne 0x00bd1958
00bd188c	ldr x8,[x19]
00bd1890	ldur x9,[x8, #-0x18]
00bd1894	sub x8,x29,#0x8
00bd1898	add x0,x19,x9
00bd189c	bl 0x00c30070
00bd18a0	adrp x1,0xcb4000
00bd18a4	sub x0,x29,#0x8
00bd18a8	ldr x1,[x1, #0xf40]
00bd18ac	bl 0x00c30080
00bd18b0	mov x21,x0
00bd18b4	sub x0,x29,#0x8
00bd18b8	bl 0x00c30090
00bd18bc	ldr x8,[x19]
00bd18c0	ldur x8,[x8, #-0x18]
00bd18c4	add x2,x19,x8
00bd18c8	ldr w3,[x2, #0x90]
00bd18cc	ldr x22,[x2, #0x28]
00bd18d0	cmn w3,#0x1
00bd18d4	b.ne 0x00bd1920
00bd18d8	sub x8,x29,#0x8
00bd18dc	mov x0,x2
00bd18e0	mov x24,x2
00bd18e4	bl 0x00c30070
00bd18e8	adrp x1,0xcb4000
00bd18ec	sub x0,x29,#0x8
00bd18f0	ldr x1,[x1, #0x998]
00bd18f4	bl 0x00c30080
00bd18f8	ldr x8,[x0]
00bd18fc	ldr x8,[x8, #0x38]
00bd1900	mov w1,#0x20
00bd1904	blr x8
00bd1908	mov w23,w0
00bd190c	sub x0,x29,#0x8
00bd1910	bl 0x00c30090
00bd1914	and w3,w23,#0xff
00bd1918	mov x2,x24
00bd191c	str w3,[x24, #0x90]
00bd1920	ldr x8,[x21]
00bd1924	ldr x8,[x8, #0x38]
00bd1928	mov x0,x21
00bd192c	mov x1,x22
00bd1930	mov x4,x20
00bd1934	blr x8
00bd1938	cbnz x0,0x00bd1958
00bd193c	ldr x8,[x19]
00bd1940	mov w9,#0x5
00bd1944	ldur x8,[x8, #-0x18]
00bd1948	add x0,x19,x8
00bd194c	ldr w8,[x0, #0x20]
00bd1950	orr w1,w8,w9
00bd1954	bl 0x00c30130
00bd1958	add x0,sp,#0x8
00bd195c	bl 0x00c43fb0
00bd1960	mov x0,x19
00bd1964	ldp x20,x19,[sp, #0x50]
00bd1968	ldp x22,x21,[sp, #0x40]
00bd196c	ldp x24,x23,[sp, #0x30]
00bd1970	ldp x29,x30,[sp, #0x20]
00bd1974	add sp,sp,#0x60
00bd1978	autiasp
00bd197c	ret
