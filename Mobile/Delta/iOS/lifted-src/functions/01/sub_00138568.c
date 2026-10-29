/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x138568..0x138efc (2452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_138568_0 {
    char field_0;
} st_138568_0;

typedef struct st_138568_4 {
    unsigned long long field_0;
} st_138568_4;

typedef struct st_138568_1 {
    char padding_0[257];
    char field_101;
} st_138568_1;

typedef struct st_138568_3 {
    char padding_0[72];
    struct st_138568_4 *field_48;
} st_138568_3;

typedef struct st_138568_2 {
    char padding_0[96];
    struct st_138568_1 *field_60;
} st_138568_2;

extern unsigned long long g_e6e9f8;
extern st_138568_2 *g_f0d198;
extern st_138568_3 *g_f0d3d8;
extern char g_10002b0;

void sub_138568(long long a0)
{
    unsigned long long v14;  // x28
    unsigned long long v15;  // x27
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    char v23;  // x0
    st_138568_0 **v0;  // [bp-0x1b0], Other Possible Types: char
    st_138568_0 *v1;  // [bp-0x1a8]
    unsigned long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = &v13;
    v12 = v22;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (!(g_f0d198->field_60->field_101 >> 2 & 1))
    {
        goto *((void *)(g_e6e9f8));
    }
    else
    {
        v23 = sub_f2358(a0, 1);
        if (!v23)
        {
            goto *((void *)(g_e6e9f8));
        }
        else if (*(long long *)(v23 + 24))
        {
            g_f0d3d8->field_48();
        }
        else
        {
            goto *((void *)(g_e6e9f8));
        }
    }
}
