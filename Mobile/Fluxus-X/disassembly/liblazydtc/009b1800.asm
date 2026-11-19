; ssl_undefined_function @ 009b1800
009b1800	stp x29,x30,[sp, #-0x10]!
009b1804	mov x29,sp
009b1808	bl 0x00c342a0
009b180c	adrp x0,0x2c5000
009b1810	adrp x2,0x2bd000
009b1814	add x0,x0,#0x652
009b1818	add x2,x2,#0x599
009b181c	mov w1,#0xf8f
009b1820	bl 0x00c342b0
009b1824	mov w1,#0x101
009b1828	mov w0,#0x14
009b182c	movk w1,#0xc, LSL #16
009b1830	mov x2,xzr
009b1834	bl 0x00c342c0
009b1838	mov w0,wzr
009b183c	ldp x29,x30,[sp], #0x10
009b1840	ret
