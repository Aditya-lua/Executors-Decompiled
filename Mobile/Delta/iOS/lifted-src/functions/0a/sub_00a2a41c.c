/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2a41c..0xa2a704 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a2a41c(void* a0, void* a1, int a2, void* a3, void* a4, long long a5, unsigned long a6)
{
    void* v3;  // w19
    unsigned long long v4;  // 4118
    long long v13;  // x19
    long long v14;  // x21
    long long v5;  // x19
    void* v6;  // w0
    int v7;  // w9
    void* v8;  // x0
    void* v9;  // x20
    void* v10;  // x0
    void* v11;  // x8
    void* v12;  // x21
    char v0;  // [bp-0x54], Other Possible Types: unsigned int
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a3;
    if (a4 == 2)
    {
LABEL_a2a454:
        switch (v3)
        {
        case 1034: case 1087:
            break;
        case 1035:
            break;
        default:
            break;
        }
        v8 = sub_a2a7c8(a5);
        if (!v8)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecx_backend.c", 186, "ossl_ecx_key_op");
            sub_a36abc(16, 0x80010, 0);
            return 0;
        }
        v9 = v8;
        if (!a4)
        {
            _memcpy(v9 + 0x11, a1, a2);
            return v9;
        }
        v10 = sub_a2a950();
        if (!v10)
        {
            v13 = 524304;
            v14 = 196;
            goto LABEL_a2a624;
        }
        else if (a4 == 2)
        {
            v11 = v9;
            switch (v3)
            {
            case 0:
LABEL_a2a608:
                if (sub_a2a0d4(v11))
                    return v9;
                v13 = 166;
                v14 = 216;
LABEL_a2a624:
                sub_a368c8();
                sub_a369bc("crypto/ec/ecx_backend.c", v14, "ossl_ecx_key_op");
                sub_a36abc(16, v13, 0);
                sub_a2a8a4(v9);
                return 0;
            case 1035:
                break;
            default:
                break;
            }
            v12 = v10;
            if ((int)sub_aa845c() < 1)
            {
                sub_a2a8a4(v9);
                return 0;
            }
            else if (v3 == 1034)
            {
                *(char *)v12 = *(char *)v12 & 248;
                *(char *)&v12[31] = 64 | (64 | (char)v12[31] & 63) & 63;
                v11 = v9;
                goto LABEL_a2a608;
            }
            else
            {
                v11 = v9;
                if (v3 == 1035)
                {
                    *(char *)v12 = *(char *)v12 & 252;
                    *(char *)&v12[55] = (char)v12[55] | 128;
                    v11 = v9;
                    goto LABEL_a2a608;
                }
            }
        }
        else
        {
            _memcpy();
            v11 = v9;
            goto LABEL_a2a608;
        }
    }
    if (a0)
    {
        sub_9cf830(0, &v0, 0, a0);
        v4 = arm64g_calculate_condition(1, v0, 1, 0);
        if (!(v4 & 1))
        {
            v5 = 167;
            goto LABEL_a2a4a4;
        }
        else
        {
            v6 = (void*)(unsigned int)sub_a99eac(*(long long *)a0);
            if (!v3)
            {
                v3 = v6;
            }
            else if (v6 != v3)
            {
                v5 = 173;
LABEL_a2a4a4:
                sub_a368c8();
                sub_a369bc("crypto/ec/ecx_backend.c", v5, "ossl_ecx_key_op");
                sub_a36abc(16, 0x66, 0);
                return 0;
            }
        }
    }
    if (!a1)
        goto LABEL_a2a694;
    switch (v3)
    {
    case 0:
LABEL_a2a694:
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_backend.c", 179, "ossl_ecx_key_op");
        sub_a36abc(16, 0x66, 0);
        return 0;
    case 1035:
        v7 = 56;
        break;
    default:
        v7 = 57;
        break;
    }
    if (v3 == 1087)
        v7 = 32;
    if (v3 == 1034)
        v7 = 32;
    if (v7 == a2)
        goto LABEL_a2a454;
    goto LABEL_a2a694;
}
