/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c87c0..0x9c8984 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c87c0_0 {
    char padding_0[8];
    unsigned long long field_8;
    void* field_10;
} st_9c87c0_0;


void* sub_9c87c0(unsigned long a0, long long a1)
{
    void* v2;  // x0
    void* v3;  // x19
    void* v12;  // x27
    void* v13;  // x27
    void* v14;  // x23
    void* v15;  // x28
    void* v17;  // x24
    void* v18;  // x0
    void* v19;  // w0
    long long v20;  // x19
    long long v21;  // x20
    void* v4;  // x20
    st_9c87c0_0 *v5;  // x0
    unsigned long v6;  // x22
    void* v7;  // x23
    void* ptr;  // x24
    void* v9;  // x8
    void* v10;  // x28
    void* v11;  // x27
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f4bd0(a1, sub_c4ba8());
    if (!v2)
    {
        v20 = 172;
        v21 = 32;
LABEL_9c8938:
        sub_a368c8();
        sub_a369bc("crypto/asn1/asn_moid.c", v21, "oid_module_init");
        sub_a36abc(13, v20, 0);
        return 0;
    }
    v3 = v2;
    if ((int)sub_ad69e4() < 1)
        return 1;
    v4 = 0;
    do
    {
        v5 = sub_ad69f8(v3, v4);
        v6 = v5->field_8;
        v7 = v5->field_10;
        ptr = _strrchr(v7, 44);
        if (ptr)
        {
            v9 = ptr + 1;
            v10 = ptr - v7;
            if (ptr != v7)
            {
                if (!*(char *)v9)
                    goto LABEL_9c8930;
                v11 = ptr;
                do
                {
                    v12 = v11;
                    v13 = v12 + 1;
                    v11 = v13;
                } while (sub_a6994c((char)v12[1], 8));
                do
                {
                    v14 = v7;
                    v15 = v10;
                    v10 = v15 - 1;
                    v7 = v14 + 1;
                } while (sub_a6994c(*(char *)v14, 8));
                while (1)
                {
                    v17 = ptr - 1;
                    if (!sub_a6994c(*((char *)ptr - 1), 8))
                        break;
                    v15 -= 1;
                    ptr = v17;
                    if (ptr == v14)
                        goto LABEL_9c8930;
                }
                v18 = sub_a6bf4c(v15 + 1, "crypto/asn1/asn_moid.c", 90);
                if (!v18)
                    goto LABEL_9c8930;
                ptr = v18;
                _memcpy();
                *(char *)(ptr + v15) = 0;
                v7 = v13;
            }
            else
            {
                ptr = 0;
                v7 = v9;
            }
        }
        v19 = (void*)(unsigned int)sub_a99efc(v7, v6);
        sub_a6c2e4(ptr, "crypto/asn1/asn_moid.c", 99);
        if (!v19)
        {
LABEL_9c8930:
            v20 = 171;
            v21 = 38;
            goto LABEL_9c8938;
        }
    } while ((v4 = (unsigned int)v4 + 1, (int)(unsigned int)v4 < (int)sub_ad69e4(v3)));
    return 1;
}
