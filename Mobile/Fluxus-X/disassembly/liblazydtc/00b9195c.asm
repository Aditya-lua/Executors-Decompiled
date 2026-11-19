; mbedtls_ecp_get_type @ 00b9195c
00b9195c	ldr x8,[x0, #0x38]
00b91960	cbz x8,0x00b91978
00b91964	ldr x8,[x0, #0x48]
00b91968	cmp x8,#0x0
00b9196c	mov w8,#0x1
00b91970	cinc w0,w8,eq
00b91974	ret
00b91978	mov w0,wzr
00b9197c	ret
