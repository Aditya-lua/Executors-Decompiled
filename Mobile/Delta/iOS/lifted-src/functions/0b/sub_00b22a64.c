/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb22a64..0xb22bf0 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b22a64(long long a0, unsigned long a1, unsigned long a2, void* a3, unsigned int *a4)
{
    long long v4;  // x22
    unsigned int v5;  // w0
    unsigned int v6;  // w8
    unsigned long v7;  // x21
    unsigned long v8;  // x0
    unsigned long v0;  // [bp-0x70]
    char v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_ab1c98();
    *(unsigned long long *)a3 = 0;
    sub_ab1cb0(a0, 0xf000);
    switch (v5)
    {
    case 4096:
        if (sub_ab8c18(v4))
        {
            v6 = 0xffffffff;
            break;
        }
        else
        {
            v0 = 0;
            if (!sub_a6eaa0(&v1))
            {
                v7 = 0;
            }
            else if (sub_c6b29c(&v1, 0xffffffff, v4) && sub_a6eaf8(&v1) && sub_c68eb8(&v1, &v0))
            {
                sub_a6ed4c(&v1);
                if (v0)
                {
                    v7 = sub_a6bf4c(v0, "providers/implementations/encode_decode/encode_key2any.c", 941);
                    if (!v7 || !sub_c688bc(&v1, v7, v0) || !sub_c6b29c(&v1, 0xffffffff, v4) || !sub_a6eaf8(&v1) || !sub_c68eb8(&v1, &v0))
                        goto LABEL_b22b88;
                    sub_a6ed4c(&v1);
                }
                else
                {
                    v7 = 0;
                }
                v8 = sub_9c7910();
                if (v8)
                {
                    *a4 = 16;
                    sub_9c79a0();
                    *(unsigned long *)a3 = v8;
                    return 1;
                }
            }
            else
            {
                v7 = 0;
LABEL_b22b88:
                sub_a6ed4c(&v1);
            }
            sub_a6c2e4(v7, "providers/implementations/encode_decode/encode_key2any.c", 974);
            return 0;
        }
    case 0:
        v6 = 5;
        break;
    default:
        return 0;
    }
    *a4 = v6;
    return 1;
}
