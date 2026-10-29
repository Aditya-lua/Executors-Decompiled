/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa94bbc..0xa94dd8 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a94bbc_0 {
    unsigned long long field_0;
    unsigned int field_8;
    unsigned int field_c;
    char padding_10[32];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    char field_41;
    char field_42;
    char field_43;
    char field_44;
    char field_45;
    char field_46;
    char field_47;
    unsigned long long field_48;
    char field_49;
    char field_4a;
    char field_4b;
    char field_4c;
    char field_4d;
    char field_4e;
    char field_4f;
    char padding_50[288];
    struct st_a94bbc_1 *field_170;
    unsigned long long field_178;
    struct st_a94bbc_1 *field_180;
} st_a94bbc_0;

typedef struct st_a94bbc_1 {
    unsigned long long field_0;
} st_a94bbc_1;

extern char g_1000000;

void sub_a94bbc(st_a94bbc_0 *a0, void* a1, unsigned long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long i;  // x23
    unsigned long long v20;  // x23
    void* v21;  // x22
    unsigned long long v23;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    void* v16;  // x22
    unsigned long v17;  // x8
    void* iter;  // x21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a1;
    *(unsigned long long *)&a0->padding_50[281] = 0;
    a0->field_30 = 0;
    a0->field_38 = 0;
    if (a2 == 12)
    {
        v17 = *(long long *)v16;
        a0->field_8 = (int)v16[8];
        a0->field_0 = v17;
        a0->field_c = (unsigned int)&g_1000000;
        a0->field_40 = 0;
        *(unsigned long long *)&a0->field_41 = 0;
        a0->field_170();
    }
    a0->field_40 = 0;
    *(unsigned long long *)&a0->field_41 = 0;
    iter = &a0->field_40;
    i = a2;
    if (a2 >= 16)
    {
        *(char *)&a0->field_40 = (char)a0->field_40 ^ *(char *)v16;
        *((char *)&a0->field_40 + 1) = *((char *)&a0->field_40 + 1) ^ (char)v16[1];
        *((char *)&a0->field_40 + 2) = *((char *)&a0->field_40 + 2) ^ (char)v16[2];
        *((char *)&a0->field_40 + 3) = *((char *)&a0->field_40 + 3) ^ (char)v16[3];
        *((char *)&a0->field_40 + 4) = *((char *)&a0->field_40 + 4) ^ (char)v16[4];
        *((char *)&a0->field_40 + 5) = *((char *)&a0->field_40 + 5) ^ (char)v16[5];
        *((char *)&a0->field_40 + 6) = *((char *)&a0->field_40 + 6) ^ (char)v16[6];
        *((char *)&a0->field_40 + 7) = *((char *)&a0->field_40 + 7) ^ (char)v16[7];
        a0->field_41 = a0->field_41 ^ (char)v16[8];
        a0->field_42 = a0->field_42 ^ (char)v16[9];
        a0->field_43 = a0->field_43 ^ (char)v16[10];
        a0->field_44 = a0->field_44 ^ (char)v16[11];
        a0->field_45 = a0->field_45 ^ (char)v16[12];
        a0->field_46 = a0->field_46 ^ (char)v16[13];
        a0->field_47 = a0->field_47 ^ (char)v16[14];
        (&a0->field_47)[1] = (&a0->field_47)[1] ^ (char)v16[15];
        (*(long long *)&a0->padding_50[273])();
    }
    else if (i)
    {
        do
        {
            v20 = i;
            v21 = v16 + 1;
            *(char *)iter = *(char *)iter ^ *(char *)v16;
            iter += 1;
            i = v20 - 1;
            v16 = v21;
        } while (i);
        (*(long long *)&a0->padding_50[273])();
    }
    else
    {
        v23 = __builtin_bswap64(a2 * 8);
        *(unsigned long long *)&a0->field_41 = *(long long *)&a0->field_41 ^ v23;
        (*(long long *)&a0->padding_50[273])();
    }
}
