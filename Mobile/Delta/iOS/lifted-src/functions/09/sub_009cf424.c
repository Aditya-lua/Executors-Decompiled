/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf424..0x9cf4d4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf424_0 {
    char padding_0[8];
    char field_8;
    char padding_9[23];
    int field_20;
} st_9cf424_0;

typedef struct st_9cf424_1 {
    char padding_0[32];
    struct st_9cf424_0 *field_20;
} st_9cf424_1;


char sub_9cf424(unsigned long a0, unsigned long a1, char a2, st_9cf424_1 *a3)
{
    st_9cf424_0 *v7;  // x9
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    void* v13;  // x21
    unsigned long v14;  // x20
    char v15;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
    {
        return 1;
    }
    else if (*(long long *)a0)
    {
        v7 = a3->field_20;
        if (!v7)
            return 1;
        v0 = v8;
        v1 = v9;
        v2 = v10;
        v3 = v11;
        v4 = &v6;
        v5 = v12;
        if (!(v7->field_8 >> 1 & 1))
            return 1;
        v13 = *(long long *)a0 + v7->field_20;
        sub_a6c2e4(*(long long *)v13, "crypto/asn1/tasn_utl.c", 172);
        if (a2 < 1)
            return 0;
        v14 = a2;
        v15 = sub_a6bf4c(v14, "crypto/asn1/tasn_utl.c", 175);
        *(unsigned long long *)v13 = v15;
        if (!v15)
            return *(unsigned int *)&v15;
        _memcpy();
        *(unsigned long *)&v13[8] = v14;
        *(unsigned int *)&v13[16] = 0;
        return 1;
    }
    else
    {
        return 1;
    }
}
