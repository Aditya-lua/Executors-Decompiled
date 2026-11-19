; Camellia_DecryptBlock @ 00a8fd34
00a8fd34	cmp w0,#0x80
00a8fd38	orr w8,wzr,#0x3
00a8fd3c	cinc w0,w8,ne
00a8fd40	b 0x00a8f95c
