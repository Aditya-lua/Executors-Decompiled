/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96bfc..0xa96d40 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a96bfc_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
    char field_8;
    char field_9;
    char field_a;
    char field_b;
    char field_c;
    char field_d;
    char field_e;
    char field_f;
} st_a96bfc_0;


char * sub_a96bfc(char *a0, char a1, st_a96bfc_0 *a2)
{
    char v0;  // x8
    unsigned int v1;  // w9
    unsigned int v10;  // w9
    unsigned int v11;  // w9
    unsigned int v12;  // w9
    unsigned int v13;  // w9
    unsigned int v14;  // w9
    unsigned int v15;  // w9
    unsigned int v2;  // w9
    unsigned int v3;  // w9
    unsigned int v4;  // w9
    unsigned int v5;  // w9
    unsigned int v6;  // w9
    unsigned int v7;  // w9
    unsigned int v8;  // w9
    unsigned int v9;  // w9

    v0 = 8 - a1;
    v1 = a0[15];
    a2->field_f = v1 << (a1 & 31);
    v2 = a0[14];
    a2->field_e = (char)(v2 << (a1 & 31)) | (char)(v1 >> (v0 & 31));
    v3 = a0[13];
    a2->field_d = (char)(v3 << (a1 & 31)) | (char)(v2 >> (v0 & 31));
    v4 = a0[12];
    a2->field_c = (char)(v4 << (a1 & 31)) | (char)(v3 >> (v0 & 31));
    v5 = a0[11];
    a2->field_b = (char)(v5 << (a1 & 31)) | (char)(v4 >> (v0 & 31));
    v6 = a0[10];
    a2->field_a = (char)(v6 << (a1 & 31)) | (char)(v5 >> (v0 & 31));
    v7 = a0[9];
    a2->field_9 = (char)(v7 << (a1 & 31)) | (char)(v6 >> (v0 & 31));
    v8 = a0[8];
    a2->field_8 = (char)(v8 << (a1 & 31)) | (char)(v7 >> (v0 & 31));
    v9 = a0[7];
    a2->field_7 = (char)(v9 << (a1 & 31)) | (char)(v8 >> (v0 & 31));
    v10 = a0[6];
    a2->field_6 = (char)(v10 << (a1 & 31)) | (char)(v9 >> (v0 & 31));
    v11 = a0[5];
    a2->field_5 = (char)(v11 << (a1 & 31)) | (char)(v10 >> (v0 & 31));
    v12 = a0[4];
    a2->field_4 = (char)(v12 << (a1 & 31)) | (char)(v11 >> (v0 & 31));
    v13 = a0[3];
    a2->field_3 = (char)(v13 << (a1 & 31)) | (char)(v12 >> (v0 & 31));
    v14 = a0[2];
    a2->field_2 = (char)(v14 << (a1 & 31)) | (char)(v13 >> (v0 & 31));
    v15 = a0[1];
    a2->field_1 = (char)(v15 << (a1 & 31)) | (char)(v14 >> (v0 & 31));
    a2->field_0 = (char)(*a0 << (a1 & 31)) | (char)(v15 >> (v0 & 31));
    return a0;
}
