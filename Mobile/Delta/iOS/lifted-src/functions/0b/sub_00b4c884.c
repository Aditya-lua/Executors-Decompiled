/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4c884..0xb4cae4 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char sub_b4c884(void* a0, char a1, long long a2)
{
    long long len;  // x0
    long long v6;  // x1
    long long v7;  // x2
    char v8;  // x19
    unsigned long long v9;  // x0
    unsigned long long *v11;  // x21
    char v12;  // x22
    unsigned long long v0;  // [bp-0x80]
    unsigned long long *v1;  // [bp-0x78]
    char v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a2)
    {
        a2 = (long long)a0[8];
        if (a1)
        {
LABEL_b4c8b8:
            len = _strlen(a1);
            v6 = a1;
            v7 = a2;
            v8 = sub_a40ca8(*(long long *)a0, v6, v7);
            v9 = sub_afd8f8(v8, v6, v7);
            if (!v8)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/dsa_sig.c", 168, "dsa_setup_md");
                v0 = a1;
                sub_a36abc(57, 122);
                sub_a3f52c(v8);
                return 0;
            }
            if ((unsigned int)v9)
            {
                if ((unsigned long long)len >= 50)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/dsa_sig.c", 178, "dsa_setup_md");
                    v0 = a1;
                    sub_a36abc(57, 122);
                    sub_a3f52c(v8);
                    return 0;
                }
                if (sub_a50b14(v8))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/dsa_sig.c", 184, "dsa_setup_md");
                    sub_a36abc(57, 183);
                    sub_a3f52c(v8);
                    return 0;
                }
                if (!((char)((char)a0[28]) >> 1 & 1))
                {
                    if ((char)a0[304])
                    {
                        v11 = a0 + 304;
                        if (!sub_a509f4(v8, v11))
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/signature/dsa_sig.c", 206, "dsa_setup_md");
                            v0 = a1;
                            v1 = v11;
                            sub_a36abc(57, 174);
                            sub_a3f52c(v8);
                            return 0;
                        }
                    }
                    sub_a3f52c(v8);
                }
                else
                {
                    sub_a3f73c((long long)a0[368]);
                    sub_a3f52c((long long)a0[360]);
                    *(unsigned long long *)&a0[296] = 0;
                    if (sub_c688bc(&v2, a0 + 36, 0x100) && sub_b5ab9c(&v2, 0xffffffff, (long long)a0[16], v9) && sub_a6eaf8(&v2))
                    {
                        sub_c68eb8(&v2, a0 + 296);
                        v12 = sub_a6e990(&v2);
                        sub_a6ed4c(&v2);
                        if (v12 && (long long)a0[296])
                            _memmove(a0 + 36, v12);
                    }
                    else
                    {
                        sub_a6ed4c(&v2);
                    }
                    *(unsigned long long *)&a0[360] = v8;
                    *(unsigned long long *)&a0[368] = 0;
                    sub_a6db20(a0 + 304, a1, 50);
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/dsa_sig.c", 173, "dsa_setup_md");
                v0 = a1;
                sub_a36abc(57, 174);
                sub_a3f52c(v8);
                return 0;
            }
        }
    }
    else if (a1)
    {
        goto LABEL_b4c8b8;
    }
    return 1;
}
